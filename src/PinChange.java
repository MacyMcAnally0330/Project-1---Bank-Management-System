import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JLabel text, pinText, rePinText;
    JTextField pin,rePin;
    JButton change, back;
    String pinNumber;
    PinChange(String pinChange){
        this.pinNumber = pinChange;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        text = new JLabel("CHANGE YOUR PIN:");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);

        pinText = new JLabel("NEW PIN:");
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System", Font.BOLD,16));
        pinText.setBounds(160,320,180,25);
        image.add(pinText);

        pin = new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330,320,180,25);
        image.add(pin);

        rePinText = new JLabel("Re-Enter NEW PIN:");
        rePinText.setForeground(Color.WHITE);
        rePinText.setFont(new Font("System", Font.BOLD,16));
        rePinText.setBounds(160,360,180,25);
        image.add(rePinText);

        rePin = new JTextField();
        rePin.setFont(new Font("Raleway",Font.BOLD,25));
        rePin.setBounds(330,360,180,25);
        image.add(rePin);

        change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == change) {
            try {
                String newPin = pin.getText();
                String rPin = rePin.getText();

                if (!newPin.equals(rPin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does NOT match!");
                    return;
                }

                if (newPin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter new PIN!");
                    return;
                }

                if (rPin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-enter new PIN!");
                    return;
                }

                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rPin+"' where pin = '"+pinNumber+"' ";
                String query2 = "update login set pinnumber = '"+rPin+"' where pinnumber = '"+pinNumber+"' ";
                String query3 = "update signupthree set pinnumber = '"+rPin+"' where pinnumber = '"+pinNumber+"' ";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "PIN changed SUCCESSFULLY!");

                setVisible(false);
                new Transaction(rPin).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        }else {
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
