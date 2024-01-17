import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class SignUpTwo extends JFrame implements ActionListener {
//This class is for the user fill in additional details information for account creation

        long random;
        JTextField qualiTextField,addressTextField,cityTextField,stateTextField,pinTextField, categoryTextField;
        JButton next;
        JRadioButton male,female,other,married,single;
        JDateChooser dateChooser;
        SignUpTwo(){

            setLayout(null);

            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

            JLabel additionalDetails = new JLabel("Page 2: Additional Details");//Sub header configuration like sizes position and Font
            additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
            additionalDetails.setBounds(290,80,400,30);
            add(additionalDetails);

            JLabel religion = new JLabel("Religion:");//details info configuration like sizes position and Font
            religion.setFont(new Font("Raleway", Font.BOLD,20));
            religion.setBounds(100,140,100,30);
            add(religion);

            String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
            JComboBox typeOfReligion = new JComboBox(valReligion);//Used JCombboBox to create the DropList
            typeOfReligion.setBounds(300,140,400,30);
            typeOfReligion.setBackground(Color.WHITE);
            add(typeOfReligion);

            JLabel category = new JLabel("Category:");//details info configuration like sizes position and Font
            category.setFont(new Font("Raleway", Font.BOLD,20));
            category.setBounds(100,190,200,30);
            add(category);

            String valeCategory[] = {"General", "OBC", "SC", "ST", "Other"};
            JComboBox typeOfCategory = new JComboBox(valeCategory);//Used JCombboBox to create the DropList
            typeOfCategory.setBounds(300,190,400,30);
            typeOfCategory.setBackground(Color.WHITE);
            add(typeOfCategory);

            JLabel income = new JLabel("Income:");//details info configuration like sizes position and Font
            income.setFont(new Font("Raleway", Font.BOLD,20));
            income.setBounds(100,240,200,30);
            add(income);

            String incomeCategory[] = {"Null", "< 50,000", "< 100,000", "< 200,000", "> 200,000"};
            JComboBox typeOfIncome = new JComboBox(incomeCategory);//Used JCombboBox to create the DropList
            typeOfIncome.setBounds(300,240,400,30);
            typeOfIncome.setBackground(Color.WHITE);
            add(typeOfIncome);

            JLabel education = new JLabel("Educational:");//details info configuration like sizes position and Font
            education.setFont(new Font("Raleway", Font.BOLD,20));
            education.setBounds(100,290,200,30);
            add(education);

            String eduCategory[] = {"HighSchool","Some College","Associate Degree", "Bachelor Degree", "Graduate Degree", "Doctorate Degree", "Others"};
            JComboBox eduValue = new JComboBox(eduCategory);//Used JCombboBox to create the DropList
            eduValue.setBounds(300,315,400,30);
            eduValue.setBackground(Color.WHITE);
            add(eduValue);

            JLabel quali = new JLabel("Qualification:");//details info configuration like sizes position and Font
            quali.setFont(new Font("Raleway", Font.BOLD,20));
            quali.setBounds(100,315,200,30);
            add(quali);

            JLabel occup = new JLabel("Occupation:");//details info configuration like sizes position and Font
            occup.setFont(new Font("Raleway", Font.BOLD,20));
            occup.setBounds(100,390,200,30);
            add(occup);

            JLabel panNum = new JLabel("Pan Number:");//details info configuration like sizes position and Font
            panNum.setFont(new Font("Raleway", Font.BOLD,20));
            panNum.setBounds(100,440,200,30);
            add(panNum);

            addressTextField = new JTextField(); //create a Text field that user can input data
            addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
            addressTextField.setBounds(300,440,400,30);
            add(addressTextField);

            JLabel aNum = new JLabel("Aadhar Number:");//details info configuration like sizes position and Font
            aNum.setFont(new Font("Raleway", Font.BOLD,20));
            aNum.setBounds(100,490,200,30);
            add(aNum);

            cityTextField = new JTextField(); //create a Text field that user can input data
            cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
            cityTextField.setBounds(300,490,400,30);
            add(cityTextField);

            JLabel senCit = new JLabel("Senior Citizen:");//details info configuration like sizes position and Font
            senCit.setFont(new Font("Raleway", Font.BOLD,20));
            senCit.setBounds(100,540,200,30);
            add(senCit);

            stateTextField = new JTextField(); //create a Text field that user can input data
            stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
            stateTextField.setBounds(300,540,400,30);
            add(stateTextField);

            JLabel exAcct = new JLabel("Existing Account:");//details info configuration like sizes position and Font
            exAcct.setFont(new Font("Raleway", Font.BOLD,20));
            exAcct.setBounds(100,590,200,30);
            add(exAcct);

            pinTextField = new JTextField(); //create a Text field that user can input data
            pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
            pinTextField.setBounds(300,590,400,30);
            add(pinTextField);

            getContentPane().setBackground(Color.WHITE);

            next = new JButton("Next"); //A button for the the next page of the application
            next.setBackground(Color.BLACK);
            next.setForeground(Color.white);
            next.setFont(new Font("Raleway",Font.BOLD,14));
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);

            setSize(850,800); //Configuration for the size of the Pop Up screen
            setLocation(350,10);
            setVisible(true);
        }

        /*public void actionPerformed(ActionEvent ae){ //this function create what will happen when user click on the "next" button
            String formNo = "" + random;
            String name = nameTextField.getText();
            String fname = fnameTextField.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if (male.isSelected()) {
                gender = "Male";
            }else if (female.isSelected()){
                gender = "Female";
            }
            String email = emailTextField.getText();
            String marital = null;
            if (single.isSelected()){
                marital = "Single";
            }else if (married.isSelected()) {
                marital = "Married";
            }else if (other.isSelected()){
                marital = "Other";
            }
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String pin = pinTextField.getText();

            //Validation check:
            try{
                if (name.equals("")){ //If the name field is empty -> an alert will pop up to remind user
                    JOptionPane.showMessageDialog(null,"Name is Required!");
                }else {
                    Conn c = new Conn();
                    String query = "insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"', '"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                    c.s.executeUpdate(query);
                }

            }catch (Exception e){
                System.out.println(e);
            }

        }*/
        public static void main(String args[]) {
            new SignUpTwo();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


