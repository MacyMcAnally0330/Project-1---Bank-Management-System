import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame {
//This class is for the user fill in details information for account creation
    SignUpOne(){

        setLayout(null);

        //assigning a random number for the application form
        Random ran = new Random();
        Long random = ((ran.nextLong() % 900L) + 1000L); //Make the random number into a long value with 4digit only

        JLabel formNo = new JLabel("APPLICATION FORM NO. " + random); //Header configuration like sizes position and Font
        formNo.setFont(new Font("Raleway", Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);

        JLabel personDetails = new JLabel("Page 1: Personal Details");//Sub header configuration like sizes position and Font
        personDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);

        JLabel name = new JLabel("Name:");//details info configuration like sizes position and Font
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        JTextField nameTextField = new JTextField(); //create a Text field that user can input data
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fName = new JLabel("Father's Name:");//details info configuration like sizes position and Font
        fName.setFont(new Font("Raleway", Font.BOLD,20));
        fName.setBounds(100,190,200,30);
        add(fName);

        JTextField fnameTextField = new JTextField(); //create a Text field that user can input data
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");//details info configuration like sizes position and Font
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        JDateChooser dateChooser = new JDateChooser(); //Import the JCalendar jar file in the libraries
        dateChooser.setBounds(300,240,400,30); //User can utlize this option to choose Date instead having to type in DOB as a String
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");//details info configuration like sizes position and Font
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JRadioButton male = new JRadioButton("Male"); //Button for Gender -> Male
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        JRadioButton female = new JRadioButton("Female"); //Button for Gender -> Female
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup(); //Limit user to pick one or the other for gender By using thr Button Group
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email:");//details info configuration like sizes position and Font
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        JTextField emailTextField = new JTextField(); //create a Text field that user can input data
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel martial = new JLabel("Martial Status:");//details info configuration like sizes position and Font
        martial.setFont(new Font("Raleway", Font.BOLD,20));
        martial.setBounds(100,390,200,30);
        add(martial);

        JRadioButton single = new JRadioButton("Single"); //Button for Martial -> Single
        single.setBounds(300,390,100,30);
        single.setBackground(Color.WHITE);
        add(single);

        JRadioButton married = new JRadioButton("Married"); //Button for Martial -> Married
        married.setBounds(450,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton other = new JRadioButton("Other"); //Button for Martial -> Other
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup martialGroup = new ButtonGroup(); //Limit user to pick one or the other for gender By using thr Button Group
        martialGroup.add(married);
        martialGroup.add(single);
        martialGroup.add(other);

        JLabel address = new JLabel("Address:");//details info configuration like sizes position and Font
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        JTextField addressTextField = new JTextField(); //create a Text field that user can input data
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city = new JLabel("City:");//details info configuration like sizes position and Font
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        JTextField cityTextField = new JTextField(); //create a Text field that user can input data
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel state = new JLabel("State:");//details info configuration like sizes position and Font
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        JTextField stateTextField = new JTextField(); //create a Text field that user can input data
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        JLabel pinCode = new JLabel("Pin Code:");//details info configuration like sizes position and Font
        pinCode.setFont(new Font("Raleway", Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);

        JTextField pinTextField = new JTextField(); //create a Text field that user can input data
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);

        getContentPane().setBackground(Color.WHITE);

        JButton next = new JButton("Next"); //A button for the the next page of the application
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);

        setSize(850,800); //Configuration for the size of the Pop Up screen
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SignUpOne();

    }

}
