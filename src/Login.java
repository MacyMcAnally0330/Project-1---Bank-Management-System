import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton Login, clear, signUp; //Global class
    JTextField cardTextField;

    JPasswordField pinTextField; //To hide the password Text
    Login() {

    setTitle("AUTOMATED TELLER MACHINE");

    setLayout(null); //Custom layout

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg")); //insert image as an icon
    Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); //Sizing the image
    ImageIcon i3 = new ImageIcon(i2);
    JLabel label = new JLabel(i3); //use the inserted image to create a label NOTE: only ImageIcon can be in the JLabel Obj
    label.setBounds(70,10,100,100); //Custom Layout
    add(label); //Add the label to the pop up screen

    JLabel text = new JLabel("Welcome to ATM"); //Font and sizing the Header
    text.setFont(new Font("Onward", Font.BOLD, 38));
    text.setBounds(200, 40, 400, 40);
    add(text);

    JLabel cardNo = new JLabel("Card No."); //Font and sizing the Lines
    cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
    cardNo.setBounds(120, 150, 150, 40);
    add(cardNo);

    cardTextField = new JTextField(); //Create an Obj to take info from user
    cardTextField.setBounds(300, 150, 230, 30);
    cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
    add(cardTextField);


    JLabel pin = new JLabel("Pin:"); //Font and sizing the Lines
    pin.setFont(new Font("Raleway", Font.BOLD, 28));
    pin.setBounds(120, 220, 250, 30);
    add(pin);

    //To hide the password Text to be visiable
    pinTextField = new JPasswordField(); //Create an Obj to take info from user
    pinTextField.setBounds(300, 220, 230, 30);
    pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
    add(pinTextField);

    Login = new JButton("SIGN IN"); //Button class to perform action when user click on it
    Login.setBounds(300,300,100,30);
    Login.setBackground(Color.BLACK); //Background color for the button
    Login.setForeground(Color.WHITE); //Text color in the Button
    Login.addActionListener(this); //Make the Button to perform an Action
    add(Login);

    clear = new JButton("CLEAR"); //Button class to perform action when user click on it
    clear.setBounds(430,300,100,30);
    clear.setBackground(Color.BLACK); //Background color for the button
    clear.setForeground(Color.WHITE); //Text color in the Button
    clear.addActionListener(this);
    add(clear);

    signUp = new JButton("SIGN UP"); //Button class to perform action when user click on it
    signUp.setBounds(300,350,230,30);
    signUp.setBackground(Color.BLACK); //Background color for the button
    signUp.setForeground(Color.WHITE); //Text color in the Button
    signUp.addActionListener(this);
    add(signUp);

    getContentPane().setBackground(Color.WHITE); //Configure the background color of the pop up screen



    setSize(800, 480); //size of the frame, the length and width
    setVisible(true); //pop up screen for the frame
    setLocation(550,200); //Set the pop up screen at the middle of the page
  }


  public static void main(String args[]) {

    new Login(); //create a new Object


  }

    @Override  //This method is needed for the ActionListener implementation
    public void actionPerformed(ActionEvent ae) {

      //create the action function in here
        if (ae.getSource() == clear) { //perform an action if the Button name equal to condition

            cardTextField.setText(""); //reset the area to empty string
            pinTextField.setText(""); //reset the area to empty string

        } else if (ae.getSource() == Login) { //perform an action if the Button name equal to condition
            Conn conn = new Conn();
            String cardNumber = cardTextField.getText();
            String pinNumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardNumber+"' and pinnumber = '"+pinNumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin!");
                }
            } catch (Exception e){
                System.out.println(e);
            }
        } else if (ae.getSource() == signUp) { //perform an action if the Button name equal to condition
            setVisible(false); //When user clicked in the "Sign Up" button -> the current screen will become not visible
            new SignUpOne().setVisible(true); //But the screen for SignUpOne will now be visible for user to input details;
        }

    }
}
