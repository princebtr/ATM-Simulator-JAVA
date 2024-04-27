package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel label1;
    JButton deposit,withdrawal,fastCash,miniState,pinchange,balanceEnq,exit;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 1080);
        add(l2);

        label1 = new JLabel("Please Select Your Transaction");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));


        deposit = new JButton("DEPOSIT");
        withdrawal = new JButton("CASH WITHDRAWL");
        fastCash = new JButton("FAST CASH");
        miniState = new JButton("MINI STATEMENT");
        pinchange = new JButton("PIN CHANGE");
        balanceEnq = new JButton("BALANCE ENQUIRY");
        exit = new JButton("EXIT");

        setLayout(null);

        label1.setBounds(235,400,700,35);
        l2.add(label1);

        deposit.setBounds(170,499,150,35);
        l2.add(deposit);

        withdrawal.setBounds(390,499,150,35);
        l2.add(withdrawal);

        fastCash.setBounds(170,543,150,35);
        l2.add(fastCash);

        miniState.setBounds(390,543,150,35);
        l2.add(miniState);

        pinchange.setBounds(170,588,150,35);
        l2.add(pinchange);

        balanceEnq.setBounds(390,588,150,35);
        l2.add(balanceEnq);

        exit.setBounds(390,633,150,35);
        l2.add(exit);


        deposit.addActionListener(this);
        withdrawal.addActionListener(this);
        fastCash.addActionListener(this);
        miniState.addActionListener(this);
        pinchange.addActionListener(this);
        balanceEnq.addActionListener(this);
        exit.addActionListener(this);


        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);



    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==withdrawal){

        }else if(ae.getSource()==fastCash){

        }else if(ae.getSource()==miniState){

        }else if(ae.getSource()==pinchange){

        }else if(ae.getSource()==balanceEnq){

        }else if(ae.getSource()==exit){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }
}