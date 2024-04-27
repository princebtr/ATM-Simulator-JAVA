package bank;

import javax.management.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login , clear , signup;
    JTextField cardno1;
    JPasswordField pin1;

    Login(){
        setTitle("JBank Login");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to JBank ATM");
        text.setFont(new Font("Osaka", Font.BOLD,38 ));
        text.setBounds(230, 40, 500, 40);
        add(text);

        JLabel cardno = new JLabel("Card Number : ");
        cardno.setFont(new Font("Raleway", Font.BOLD,28 ));
        cardno.setBounds(120, 150, 250, 40);
        add(cardno);

        cardno1 = new JTextField();
        cardno1.setFont(new Font("Raleway", Font.BOLD,18 ));
        cardno1.setBounds(350, 150, 250, 40);
        add(cardno1);

        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway", Font.BOLD,28 ));
        pin.setBounds(250, 220, 150, 40);
        add(pin);

        pin1 = new JPasswordField();
        pin1.setFont(new Font("Raleway", Font.BOLD,18 ));
        pin1.setBounds(350, 220, 250, 40);
        add(pin1);

        login = new JButton("Sign In");
        login.setBounds(350, 300, 100, 30);
        login.setBackground(Color.DARK_GRAY);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(500, 300, 100, 30);
        clear.setBackground(Color.DARK_GRAY);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(350, 350, 250, 30);
        signup.setBackground(Color.DARK_GRAY);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == login){
            Connect con = new Connect();
            String cardno = cardno1.getText();
            String pin = pin1.getText();
            String query = "SELECT * FROM login WHERE cardno = '" + cardno + "' AND pin = '" + pin + "'";
            try{
                ResultSet res = con.s.executeQuery(query);
                if(res.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or Pin");
                }
            } catch (Exception ea){
                System.out.println(ea.getMessage());
            }

        } else if (e.getSource() == signup) {
            SignupOne signupOne = new SignupOne();
            signupOne.setVisible(true);
            setVisible(false);
        } else if (e.getSource() == clear) {
            cardno1.setText("");
            pin1.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
