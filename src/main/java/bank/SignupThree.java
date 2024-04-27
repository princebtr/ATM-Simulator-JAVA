package bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JLabel acctype, cardno, maskedcard, label1, label2, pin, label3, label4, label5, label6, label7;
    JRadioButton saving, fixeddep, current, reccuringdep;
    JButton submit, cancel;
    JCheckBox atm, intban, mobban, emailalerts, cheque, esatat, tnc;

    public SignupThree() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(20, 0, 100, 100);
        add(label);

        JLabel formno = new JLabel("Welcome to JBank");
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(250, 29, 600, 40);
        add(formno);

        JLabel Details = new JLabel("Page 03 : Personal Details");
        Details.setFont(new Font("Raleway", Font.BOLD, 18));
        Details.setBounds(300, 89, 400, 40);
        add(Details);

        acctype = new JLabel("Account Type:");
        acctype.setFont(new Font("Raleway", Font.BOLD, 18));

        cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 18));

        maskedcard = new JLabel("XXXX-XXXX-XXXX-4184");
        maskedcard.setFont(new Font("Raleway", Font.BOLD, 18));

        label1 = new JLabel("(Your 16-digit Card number)");
        label1.setFont(new Font("Raleway", Font.BOLD, 12));

        label2 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        label2.setFont(new Font("Raleway", Font.BOLD, 12));

        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));

        label3 = new JLabel("XXXX");
        label3.setFont(new Font("Raleway", Font.BOLD, 18));

        label4 = new JLabel("(4-digit password)");
        label4.setFont(new Font("Raleway", Font.BOLD, 12));

        label5 = new JLabel("Services Required:");
        label5.setFont(new Font("Raleway", Font.BOLD, 18));

        label6 = new JLabel("Form No:");
        label6.setFont(new Font("Raleway", Font.BOLD, 14));

        label7 = new JLabel(SignupOne.random);
        label7.setFont(new Font("Raleway", Font.BOLD, 14));

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);


        atm = new JCheckBox("ATM CARD");
        atm.setBackground(Color.WHITE);
        atm.setFont(new Font("Raleway", Font.BOLD, 16));

        intban = new JCheckBox("Internet Banking");
        intban.setBackground(Color.WHITE);
        intban.setFont(new Font("Raleway", Font.BOLD, 16));

        mobban = new JCheckBox("Mobile Banking");
        mobban.setBackground(Color.WHITE);
        mobban.setFont(new Font("Raleway", Font.BOLD, 16));

        emailalerts = new JCheckBox("EMAIL Alerts");
        emailalerts.setBackground(Color.WHITE);
        emailalerts.setFont(new Font("Raleway", Font.BOLD, 16));

        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(Color.WHITE);
        cheque.setFont(new Font("Raleway", Font.BOLD, 16));

        esatat = new JCheckBox("E-Statement");
        esatat.setBackground(Color.WHITE);
        esatat.setFont(new Font("Raleway", Font.BOLD, 16));

        tnc = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
        tnc.setBackground(Color.WHITE);
        tnc.setFont(new Font("Raleway", Font.BOLD, 12));


        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBackground(Color.WHITE);

        fixeddep = new JRadioButton("Fixed Deposit Account");
        fixeddep.setFont(new Font("Raleway", Font.BOLD, 16));
        fixeddep.setBackground(Color.WHITE);

        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBackground(Color.WHITE);

        reccuringdep = new JRadioButton("Recurring Deposit Account");
        reccuringdep.setFont(new Font("Raleway", Font.BOLD, 16));
        reccuringdep.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(saving);
        groupgender.add(fixeddep);
        groupgender.add(current);
        groupgender.add(reccuringdep);

        setLayout(null);

        label6.setBounds(700, 10, 70, 30);
        add(label6);

        label7.setBounds(770, 10, 40, 30);
        add(label7);

        acctype.setBounds(100, 140, 200, 30);
        add(acctype);

        saving.setBounds(100, 180, 150, 30);
        add(saving);

        fixeddep.setBounds(350, 180, 300, 30);
        add(fixeddep);

        current.setBounds(100, 220, 250, 30);
        add(current);

        reccuringdep.setBounds(350, 220, 250, 30);
        add(reccuringdep);

        cardno.setBounds(100, 300, 200, 30);
        add(cardno);

        maskedcard.setBounds(330, 300, 250, 30);
        add(maskedcard);

        label1.setBounds(100, 330, 200, 20);
        add(label1);

        label2.setBounds(330, 330, 500, 20);
        add(label2);

        pin.setBounds(100, 370, 200, 30);
        add(pin);

        label3.setBounds(330, 370, 200, 30);
        add(label3);

        label4.setBounds(100, 400, 200, 20);
        add(label4);

        label5.setBounds(100, 450, 200, 30);
        add(label5);

        atm.setBounds(100, 500, 200, 30);
        add(atm);

        intban.setBounds(350, 500, 200, 30);
        add(intban);

        mobban.setBounds(100, 550, 200, 30);
        add(mobban);

        emailalerts.setBounds(350, 550, 200, 30);
        add(emailalerts);

        cheque.setBounds(100, 600, 200, 30);
        add(cheque);

        esatat.setBounds(350, 600, 200, 30);
        add(esatat);

        tnc.setBounds(100, 650, 600, 20);
        add(tnc);

        submit.setBounds(250, 700, 100, 30);
        add(submit);

        cancel.setBounds(420, 700, 100, 30);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupThree();
    }

    public void actionPerformed(ActionEvent e) {
        String formno = SignupOne.random;
        String acctype = null;
        if (saving.isSelected()) {
            acctype = "Saving";
        } else if (fixeddep.isSelected()) {
            acctype = "FixedDeposit";
        } else if (current.isSelected()) {
            acctype = "Current";
        } else if (reccuringdep.isSelected()) {
            acctype = "Recurring";
        }

        Random ran = new Random();
        long n1 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(n1);

        long n2 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(n2);

        String facility = "";
        if (atm.isSelected()) {
            facility = facility + " ATM Card";
        }
        if (intban.isSelected()) {
            facility = facility + " Internet Banking";
        }
        if (mobban.isSelected()) {
            facility = facility + " Mobile Banking";
        }
        if (emailalerts.isSelected()) {
            facility = facility + " EMAIL Alerts";
        }
        if (cheque.isSelected()) {
            facility = facility + " Cheque Book";
        }
        if (esatat.isSelected()) {
            facility = facility + " E-Statement";
        }

        try {
            if (e.getSource() == submit) {

                if (acctype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Connect c1 = new Connect();
                    String q1 = "insert into signup3 values('" + formno + "','" + acctype + "','" + cardno + "','" + pin + "','" + facility + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:" + pin);
                    setVisible(false);
                    new Login().setVisible(true);

                }

            } else if (e.getSource() == cancel) {
                System.exit(0);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
