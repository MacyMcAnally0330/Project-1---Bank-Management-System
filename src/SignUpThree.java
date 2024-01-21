import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignUpThree(String formno){
        this.formno = formno;
        setLayout(null);

        JLabel pageInfo = new JLabel("Page 3: Account Details"); //Page 3 of the SignUp class: User can choose the account type, give the ATM card info + setup pin for card
        pageInfo.setFont(new Font("Raleway",Font.BOLD,22));
        pageInfo.setBounds(280,40,400,40);
        add(pageInfo);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);

        ButtonGroup groupAccounts = new ButtonGroup();
        groupAccounts.add(r1);
        groupAccounts.add(r2);
        groupAccounts.add(r3);
        groupAccounts.add(r4);

        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel cardNo = new JLabel("XXXX-XXXX-XXXX-4184");
        cardNo.setFont(new Font("Raleway",Font.BOLD,22));
        cardNo.setBounds(330,300,300,30);
        add(cardNo);

        JLabel cardDetail = new JLabel("Your 16 Digit Card Number"); //Like a helptext
        cardDetail.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetail.setBounds(100,330,300,20);
        add(cardDetail);

        JLabel pin = new JLabel("Pin Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pinNo = new JLabel("XXXX");
        pinNo.setFont(new Font("Raleway",Font.BOLD,22));
        pinNo.setBounds(330,370,300,30);
        add(pinNo);

        JLabel pinDetail = new JLabel("Your 4 Digit Password");
        pinDetail.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetail.setBounds(100,400,300,20);
        add(pinDetail);

        JLabel serviceReq = new JLabel("Services Required");
        serviceReq.setFont(new Font("Raleway",Font.BOLD,22));
        serviceReq.setBounds(100,450,400,30);
        add(serviceReq);

        c1 = new JCheckBox("ATM CARD"); //CheckBox class so user can select services as needed for account creation
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking"); //CheckBox class so user can select services as needed for account creation
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking"); //CheckBox class so user can select services as needed for account creation
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts"); //CheckBox class so user can select services as needed for account creation
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Check Book"); //CheckBox class so user can select services as needed for account creation
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement"); //CheckBox class so user can select services as needed for account creation
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge."); //CheckBox class so user can select services as needed for account creation
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("RaleWay", Font.BOLD, 14));
        submit.setBounds(220, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("RaleWay", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE); //Make the button setting to show up


        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(submit)) {
            String accountType = null;
            if (r1.isSelected()){
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()){
                accountType = "Current Account";
            } else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }

            Random random = new Random(); //generate a random 16 digits card number
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L); //Avoid any decimal

            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facility = "";  //to combine all the selected checkbox into a String

            if (c1.isSelected()){
                facility = facility + " ,ATM Card";
            }
            if (c2.isSelected()) {
                facility = facility + " ,Internet Banking";
            }
            if (c3.isSelected()) {
                facility = facility + " ,Mobile Banking";
            }
            if (c4.isSelected()) {
                facility = facility + " ,EMAIL & SMS Alerts";
            }
            if (c5.isSelected()) {
                facility = facility + " ,Check Book";
            }
            if (c6.isSelected()) {
                facility = facility + " ,E-Statement";
            }

            try { //Database connection
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardNumber+"', '"+pinNumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);


                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin: " + pinNumber);
                }
            }catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource().equals(cancel)) {
            
        }
    }
    public static void main(String args[]) {
        new SignUpThree("");
    }
}
