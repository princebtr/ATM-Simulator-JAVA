package bank;

import bank.SignupOne;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    JLabel l1 , l2 ,religion , category , income , education , occupation , pan , aadhar , seniourCitizen , existingacc , dummy;

    JTextField pan1 , aadhar1;

    JComboBox religion1, category1, income1, education1, occupation1;

    JRadioButton scyes, scno, eayes, eano ;

    JButton next , previous;

    SignupTwo(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(100, 0, 100, 100);
        add(label);

        JLabel formno = new JLabel("Welcome to JBank");
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(290, 29, 600, 40);
        add(formno);

        l1 = new JLabel("Form No:");
        l1.setFont(new Font("Raleway", Font.BOLD, 14));

        l2 = new JLabel(SignupOne.random);
        l2.setFont(new Font("Raleway", Font.BOLD, 14));

        l1.setBounds(700, 10, 70, 30);
        add(l1);

        l2.setBounds(770, 10, 40, 30);
        add(l2);


        JLabel Details = new JLabel("Page 02 : Personal Details");
        Details.setFont(new Font("Raleway",Font.BOLD,18));
        Details.setBounds(340, 89, 400, 40);
        add(Details);

        religion = new JLabel("Religion : ");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100, 140, 200, 30);
        add(religion);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion1 = new JComboBox(religion);
        religion1.setBackground(Color.WHITE);
        religion1.setFont(new Font("Raleway", Font.BOLD, 14));
        religion1.setBounds(300, 140, 400, 30);
        add(religion1);

        category = new JLabel("Category : ");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String category[] = {"General","OBC","SC","ST","Other"};
        category1 = new JComboBox(category);
        category1.setBackground(Color.WHITE);
        category1.setFont(new Font("Raleway", Font.BOLD, 14));
        category1.setBounds(300, 190, 400, 30);
        add(category1);

        income = new JLabel("Income : ");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        income1 = new JComboBox(income);
        income1.setBackground(Color.WHITE);
        income1.setFont(new Font("Raleway", Font.BOLD, 14));
        income1.setBounds(300, 240, 400, 30);
        add(income1);

        education = new JLabel("Education : ");
        education.setFont(new Font("Raleway",Font.BOLD,20));
        education.setBounds(100, 290, 400, 30);
        add(education);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education1 = new JComboBox(education);
        education1.setBackground(Color.WHITE);
        education1.setFont(new Font("Raleway", Font.BOLD, 14));
        education1.setBounds(300, 290, 400, 30);
        add(education1);

        occupation = new JLabel("Occupation : ");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100, 340, 200, 30);
        add(occupation);

        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupation1 = new JComboBox(occupation);
        occupation1.setBackground(Color.WHITE);
        occupation1.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation1.setBounds(300, 340, 400, 30);
        add(occupation1);

        pan = new JLabel("Pan Number : ");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100, 390, 200, 30);
        add(pan);

        pan1 = new JTextField();
        pan1.setFont(new Font("Raleway",Font.BOLD,20));
        pan1.setBounds(300, 390, 400, 30);
        add(pan1);

        aadhar = new JLabel("Aadhar Number : ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100, 440, 200, 30);
        add(aadhar);

        aadhar1 = new JTextField();
        aadhar1.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar1.setBounds(300, 440, 400, 30);
        add(aadhar1);

        seniourCitizen = new JLabel("Seniour Citizen : ");
        seniourCitizen.setFont(new Font("Raleway",Font.BOLD,20));
        seniourCitizen.setBounds(100, 490, 200, 30);
        add(seniourCitizen);

        scyes = new JRadioButton("Yes");
        scyes.setFont(new Font("Raleway",Font.BOLD,20));
        scyes.setBounds(300, 490, 100, 30);
        scyes.setBackground(Color.WHITE);
        add(scyes);

        scno = new JRadioButton("No");
        scno.setFont(new Font("Raleway",Font.BOLD,20));
        scno.setBounds(450, 490, 100, 30);
        scno.setBackground(Color.WHITE);
        add(scno);

        ButtonGroup group = new ButtonGroup();
        group.add(scyes);
        group.add(scno);


        existingacc = new JLabel("Existingacc : ");
        existingacc.setFont(new Font("Raleway",Font.BOLD,20));
        existingacc.setBounds(100, 540, 200, 30);
        add(existingacc);

        eayes = new JRadioButton("Yes");
        eayes.setFont(new Font("Raleway",Font.BOLD,20));
        eayes.setBounds(300, 540, 100, 30);
        eayes.setBackground(Color.WHITE);
        add(eayes);

        eano = new JRadioButton("No");
        eano.setFont(new Font("Raleway",Font.BOLD,20));
        eano.setBounds(450, 540, 100, 30);
        eano.setBackground(Color.WHITE);
        add(eano);

        ButtonGroup bg = new ButtonGroup();
        bg.add(eayes);
        bg.add(eano);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBounds(550,590,150,35);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        previous = new JButton("Previous");
        previous.setFont(new Font("Raleway",Font.BOLD,18));
        previous.setBounds(550,640,150,35);
        previous.setBackground(Color.BLACK);
        previous.setForeground(Color.WHITE);
        previous.addActionListener(this);
        add(previous);

        dummy = new JLabel("Seniour Citizen : ");
        dummy.setVisible(false);
        add(dummy);




        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == previous) {
            setVisible(false);
            new SignupOne().setVisible(true);
            return;
        }
        String formno = "" + SignupOne.random;
        String religion = (String)religion1.getSelectedItem();
        String category = (String)category1.getSelectedItem();
        String income = (String)income1.getSelectedItem();
        String education = (String)education1.getSelectedItem();
        String occupation = (String)occupation1.getSelectedItem();

        String pan = pan1.getText();
        String aadhar = aadhar1.getText();

        String scitizen = "";
        if(scyes.isSelected()){
            scitizen = "Yes";
        }
        else if(scno.isSelected()){
            scitizen = "No";
        }

        String eaccount = "";
        if(eayes.isSelected()){
            eaccount = "Yes";
        }else if(eano.isSelected()){
            eaccount = "No";
        }

        try{
            if(pan1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter your Pan Number");
            } else if (aadhar1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the required Aadhar Number");

            } else{
                Connect c1 = new Connect();
                String query = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(query);
                setVisible(false);
                new SignupThree().setVisible(true);
            }



        }catch(Exception ea){
            System.out.println(ea.getMessage());
        }

    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}
