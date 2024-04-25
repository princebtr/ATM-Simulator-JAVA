package bank;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignupOne extends JFrame{

    JLabel name ,fathername, dateofbirth, gender,email,maritalstatus,address,city,pincode,state,date,month,year;

    Random ran = new Random();
    long first = (ran.nextLong() % 9000L) + 1000L;
    String random = "" + Math.abs(first);
    
    SignupOne(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(20, 1, 100, 100);
        add(label);

        JLabel formno = new JLabel("Application Form Number : " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 29, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,30));
        personalDetails.setBounds(280, 89, 400, 40);
        add(personalDetails);

        name = new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 149, 200, 30);
        add(name);

        fathername = new JLabel("Father's Name : ");
        fathername.setFont(new Font("Raleway",Font.BOLD,20));
        fathername.setBounds(100, 199, 200, 30);
        add(fathername);

        dateofbirth = new JLabel("Date of Birth : ");
        dateofbirth.setFont(new Font("Raleway",Font.BOLD,20));
        dateofbirth.setBounds(100, 249, 200, 30);
        add(dateofbirth);

        gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 299, 200, 30);
        add(gender);

        email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 349, 200, 30);
        add(email);

        maritalstatus = new JLabel("Marital Status : ");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100, 399, 200, 30);
        add(maritalstatus);

        address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 449, 200, 30);
        add(address);

        city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 499, 200, 30);
        add(city);

        pincode = new JLabel("Pin Code : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 549, 200, 30);
        add(pincode);

        state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 599, 200, 30);
        add(state);

        date = new JLabel("Date : ");
        date.setFont(new Font("Raleway",Font.BOLD,20));
        date.setBounds(100, 649, 200, 30);
        add(date);

        month = new JLabel("Month : ");
        month.setFont(new Font("Raleway",Font.BOLD,20));
        month.setBounds(100, 699, 200, 30);
        add(month);

        year = new JLabel("Year : ");
        year.setFont(new Font("Raleway",Font.BOLD,20));
        year.setBounds(100, 749, 200, 30);
        add(year);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
