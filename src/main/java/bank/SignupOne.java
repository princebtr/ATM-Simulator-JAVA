package bank;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupOne extends JFrame implements ActionListener {

    JLabel l1 , l2 ,name ,fathername, dateofbirth, gender,email,maritalstatus,address,city,pincode,state;
    JTextField name1 ,fathername1,email1,address1,city1,pincode1,state1;
    JDateChooser dateofbirth1;
    JRadioButton male,female, other, yes, no;
    JButton next;

    static Random ran = new Random();
    static long first = (ran.nextLong() % 9000L) + 1000L;
    public static String random = "" + Math.abs(first);

    SignupOne(){
        setLayout(null);

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


        JLabel personalDetails = new JLabel("Page 01 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        personalDetails.setBounds(340, 89, 400, 40);
        add(personalDetails);

        name = new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 200, 30);
        add(name);

        name1 = new JTextField();
        name1.setFont(new Font("Raleway",Font.BOLD,20));
        name1.setBounds(300, 140, 400, 30);
        add(name1);

        fathername = new JLabel("Father's Name : ");
        fathername.setFont(new Font("Raleway",Font.BOLD,20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);

        fathername1 = new JTextField();
        fathername1.setFont(new Font("Raleway",Font.BOLD,20));
        fathername1.setBounds(300, 190, 400, 30);
        add(fathername1);

        dateofbirth = new JLabel("Date of Birth : ");
        dateofbirth.setFont(new Font("Raleway",Font.BOLD,20));
        dateofbirth.setBounds(100, 240, 200, 30);
        add(dateofbirth);

        dateofbirth1 = new JDateChooser();
        dateofbirth1.setFont(new Font("Raleway",Font.BOLD,20));
        dateofbirth1.setBounds(300, 240, 400, 30);
        add(dateofbirth1);

        gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setFont(new Font("Raleway",Font.PLAIN,18));
        male.setBounds(300, 290, 100, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setFont(new Font("Raleway",Font.PLAIN,18));
        female.setBounds(450, 290, 100, 30);
        add(female);

        other = new JRadioButton("Other");
        other.setBackground(Color.WHITE);
        other.setFont(new Font("Raleway",Font.PLAIN,18));
        other.setBounds(600, 290, 100, 30);
        add(other);

        ButtonGroup gendergr = new ButtonGroup();
        gendergr.add(male);
        gendergr.add(female);
        gendergr.add(other);

        email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        email1 = new JTextField();
        email1.setFont(new Font("Raleway",Font.BOLD,20));
        email1.setBounds(300, 340, 400, 30);
        add(email1);

        maritalstatus = new JLabel("Marital Status : ");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100, 390, 200, 30);
        add(maritalstatus);

        yes = new JRadioButton("Married");
        yes.setFont(new Font("Raleway",Font.PLAIN,18));
        yes.setBounds(300, 390, 100, 30);
        yes.setBackground(Color.WHITE);
        add(yes);

        no = new JRadioButton("Unmarried");
        no.setFont(new Font("Raleway",Font.PLAIN,18));
        no.setBounds(450, 390, 200, 30);
        no.setBackground(Color.WHITE);
        add(no);

        ButtonGroup ms = new ButtonGroup();
        ms.add(yes);
        ms.add(no);

        address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        address1 = new JTextField();
        address1.setFont(new Font("Raleway",Font.BOLD,20));
        address1.setBounds(300, 440, 400, 30);
        add(address1);

        city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        city1 = new JTextField();
        city1.setFont(new Font("Raleway",Font.BOLD,20));
        city1.setBounds(300, 490, 400, 30);
        add(city1);

        pincode = new JLabel("Pin Code : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 540, 200, 30);
        add(pincode);

        pincode1 = new JTextField();
        pincode1.setFont(new Font("Raleway",Font.BOLD,20));
        pincode1.setBounds(300, 540, 400, 30);
        add(pincode1);

        state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 590, 200, 30);
        add(state);

        state1 = new JTextField();
        state1.setFont(new Font("Raleway",Font.BOLD,20));
        state1.setBounds(300, 590, 400, 30);
        add(state1);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBounds(550,670,150,35);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String formno = "" + random;
        String name = name1.getText();
        String fathername = fathername1.getText();
        String email = email1.getText();
        String address = address1.getText();
        String city = city1.getText();
        String pincode = pincode1.getText();
        String state = state1.getText();
        String dob = ((JTextField)dateofbirth1.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }else {
            gender = "Other";
        }

        String maritial = null;
        if(yes.isSelected()){
            maritial = "Married";
        }else if(no.isSelected()){
            maritial = "Unmarried";
        }
        try{
            if(name.isEmpty() ){
                JOptionPane.showMessageDialog(null, "Please enter your name");
            } else if (fathername.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your fathername");
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your email");
            } else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your address");
            } else if (city.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your city");
            } else if (pincode.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your pincode");
            } else if (state.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your state");
            } else if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your dob");
            } else {
                Connect con = new Connect();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+email+"','"+address+"','"+city+"','"+pincode+"','"+state+"','"+dob+"','"+gender+"','"+maritial+"')";
                con.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo().setVisible(true);
            }

        }catch (Exception es){
            System.out.println(es.getMessage());
        }

    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
