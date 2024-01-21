import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class SignUpTwo extends JFrame implements ActionListener {
//This class is for the user fill in additional details information for account creation

        JTextField panTextField,aNumTextField,pinTextField;
        JButton next;
        JRadioButton yes,no,eYes,eNo;
        JComboBox typeOfReligion,typeOfCategory,typeOfIncome,eduValue,occupationVal;
        String formNo;
        SignUpTwo(String formNo){
            this.formNo = formNo;
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
            typeOfReligion = new JComboBox(valReligion);//Used JCombboBox to create the DropList
            typeOfReligion.setBounds(300,140,400,30);
            typeOfReligion.setBackground(Color.WHITE);
            add(typeOfReligion);

            JLabel category = new JLabel("Category:");//details info configuration like sizes position and Font
            category.setFont(new Font("Raleway", Font.BOLD,20));
            category.setBounds(100,190,200,30);
            add(category);

            String valeCategory[] = {"General", "OBC", "SC", "ST", "Other"};
            typeOfCategory = new JComboBox(valeCategory);//Used JCombboBox to create the DropList
            typeOfCategory.setBounds(300,190,400,30);
            typeOfCategory.setBackground(Color.WHITE);
            add(typeOfCategory);

            JLabel income = new JLabel("Income:");//details info configuration like sizes position and Font
            income.setFont(new Font("Raleway", Font.BOLD,20));
            income.setBounds(100,240,200,30);
            add(income);

            String incomeCategory[] = {"Null", "< 50,000", "< 100,000", "< 200,000", "> 200,000"};
            typeOfIncome = new JComboBox(incomeCategory);//Used JCombboBox to create the DropList
            typeOfIncome.setBounds(300,240,400,30);
            typeOfIncome.setBackground(Color.WHITE);
            add(typeOfIncome);

            JLabel education = new JLabel("Educational:");//details info configuration like sizes position and Font
            education.setFont(new Font("Raleway", Font.BOLD,20));
            education.setBounds(100,290,200,30);
            add(education);

            String eduCategory[] = {"HighSchool","Some College","Associate Degree", "Bachelor Degree", "Graduate Degree", "Doctorate Degree", "Others"};
            eduValue = new JComboBox(eduCategory);//Used JCombboBox to create the DropList
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

            String occupVal[] = {"Salaried","Self Employed","Business", "Student", "Retired","Others"};
            occupationVal = new JComboBox(occupVal);//Used JCombboBox to create the DropList
            occupationVal.setBounds(300,390,400,30);
            occupationVal.setBackground(Color.WHITE);
            add(occupationVal);

            JLabel panNum = new JLabel("Pan Number:");//details info configuration like sizes position and Font
            panNum.setFont(new Font("Raleway", Font.BOLD,20));
            panNum.setBounds(100,440,200,30);
            add(panNum);

            panTextField = new JTextField(); //create a Text field that user can input data
            panTextField.setFont(new Font("Raleway", Font.BOLD,14));
            panTextField.setBounds(300,440,400,30);
            add(panTextField);

            JLabel aNum = new JLabel("Aadhar Number:");//details info configuration like sizes position and Font
            aNum.setFont(new Font("Raleway", Font.BOLD,20));
            aNum.setBounds(100,490,200,30);
            add(aNum);

            aNumTextField = new JTextField(); //create a Text field that user can input data
            aNumTextField.setFont(new Font("Raleway", Font.BOLD,14));
            aNumTextField.setBounds(300,490,400,30);
            add(aNumTextField);

            JLabel senCit = new JLabel("Senior Citizen:");//details info configuration like sizes position and Font
            senCit.setFont(new Font("Raleway", Font.BOLD,20));
            senCit.setBounds(100,540,200,30);
            add(senCit);

            yes = new JRadioButton("Yes"); //Button for Martial -> Married
            yes.setBounds(300,540,100,30);
            yes.setBackground(Color.WHITE);
            add(yes);

            no = new JRadioButton("No"); //Button for Martial -> Married
            no.setBounds(450,540,100,30);
            no.setBackground(Color.WHITE);
            add(no);

            ButtonGroup sCitizenGroup = new ButtonGroup(); //Limit user to pick one or the other for gender By using thr Button Group
            sCitizenGroup.add(yes);
            sCitizenGroup.add(no);

            JLabel exAcct = new JLabel("Existing Account:");//details info configuration like sizes position and Font
            exAcct.setFont(new Font("Raleway", Font.BOLD,20));
            exAcct.setBounds(100,590,200,30);
            add(exAcct);

            eYes = new JRadioButton("Yes"); //Button for Martial -> Married
            eYes.setBounds(300,590,100,30);
            eYes.setBackground(Color.WHITE);
            add(eYes);

            eNo = new JRadioButton("No"); //Button for Martial -> Married
            eNo.setBounds(450,590,100,30);
            eNo.setBackground(Color.WHITE);
            add(eNo);

            ButtonGroup sExAcct = new ButtonGroup(); //Limit user to pick one or the other for gender By using thr Button Group
            sExAcct.add(eNo);
            sExAcct.add(eYes);

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

        public void actionPerformed(ActionEvent ae){ //this function create what will happen when user click on the "next" button
            String sReligion = (String) typeOfReligion.getSelectedItem();
            String sCategory = (String) typeOfCategory.getSelectedItem();
            String sIncome = (String)  typeOfIncome.getSelectedItem();
            String sEducation = (String) eduValue.getSelectedItem();
            String sOccupation = (String) occupationVal.getSelectedItem();
            String sSeniorCitizen = null;
            if (no.isSelected()) {
                sSeniorCitizen = "No";
            }else if (yes.isSelected()){
                sSeniorCitizen = "Yes";
            }
            String sExistingAccount = null;
            if (eYes.isSelected()){
                sExistingAccount = "Yes";
            }else if (eNo.isSelected()) {
                sExistingAccount = "No";
            }
            String sPanNumber = panTextField.getText();
            String sANum = aNumTextField.getText();

            //Validation check:
            try{
                    Conn c = new Conn();
                    String query = "insert into signuptwo values('"+formNo+"','"+sReligion+"','"+sCategory+"','"+sIncome+"', '"+sEducation+"','"+sOccupation+"','"+sSeniorCitizen+"','"+sPanNumber+"','"+sANum+"','"+sExistingAccount+"')";
                    c.s.executeUpdate(query);

                    //SignUp3 Object
                    setVisible(false);
                    new SignUpThree(formNo).setVisible(true);

            }catch (Exception e){
                System.out.println(e);
            }

        }
        public static void main(String args[]) {
            new SignUpTwo("");
        }

    }


