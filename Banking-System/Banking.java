package com.today;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.io.*;
import java.util.*;

public class Banking extends JPanel implements ActionListener
{
    public static void main(String ss[])
    {
        new Banking();
    }


    JFrame f2;

    JLabel l1,l2,l3,l4,l5,l6,user,l7,l8; // declared label to display text
    JTextField t1,t2,t5,t7;  // declare area to type some text
    JTextArea t4,t3;          // for multiple text like description
    JPasswordField pw;  // for password field
    JButton b1,b2,ok;      // for button
    JRadioButton r1,r2,r3;  // ratio button
    JTextArea output;

    Banking()
    {
// this is use to display text on frame
        f2=new JFrame("Create your a/c");

// this is use to display text label on the screen
        l1=new JLabel("Name:");
        l2=new JLabel("Surname");
        l3=new JLabel("Discription");
        l4=new JLabel("Date of Birth");
        l5=new JLabel("Gender");
        l6=new JLabel("address");
        user=new JLabel("User Name:");
        l7=new JLabel("password");
        l8=new JLabel("phone no");

// this area is use to write text as well as to enter password and
//  number
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextArea();
        t4=new JTextArea();
        t5=new JTextField();
        pw=new JPasswordField();
        t7=new JTextField();

        output=new JTextArea();  //for output

// this are is use to display image on screen




        ImageIcon bg=new ImageIcon("atm.png");

        JLabel bgi=new JLabel(" ",bg,JLabel.CENTER);

// for selecting gender using radio button
        ButtonGroup o=new ButtonGroup();
        r1=new JRadioButton("male",false);
        r2=new JRadioButton("female",false);
        r3=new JRadioButton("other",false);

// this for check the condition
        JCheckBox cond=new JCheckBox("I accept all term and condition");

        b1=new JButton("Ok");
        b2=new JButton("Cancel");

        Choice c=new Choice();
        Choice c2=new Choice();
        Choice c3=new Choice();

// about size , layout , color of frame
        f2.setVisible(true);
        f2.setSize(1000,1000);
        f2.setLayout(null);
        f2.setBackground(Color.WHITE);
        f2.setForeground(Color.BLUE);
        bgi.setBounds(500,0,500,500);

// location of object in frame

        cond.setBounds(10,400,400,20);
        output.setBounds(500,0,500,500);
        output.setBackground(Color.white);
        output.setForeground(Color.red);

        l1.setBounds(10,10,100,20);
        t1.setBounds(110,10,200,20);

        l2.setBounds(10,50,100,20);
        t2.setBounds(110,50,200,20);

        l3.setBounds(10,90,100,20);
        t3.setBounds(110,90,200,30);

        l4.setBounds(10,130,100,20);
        c.setBounds(110,130,100,20);
        c2.setBounds(210,130,100,20);
        c3.setBounds(310,130,100,20);

        l5.setBounds(10,170,100,20);
        r1.setBounds(110,170,100,20);
        r2.setBounds(210,170,100,20);
        r3.setBounds(310,170,100,20);

        l6.setBounds(10,210,100,20);
        t4.setBounds(110,210,200,20);
        t4.setEditable(true);
        user.setBounds(10,250,100,20);
        t5.setBounds(110,250,200,20);

        l7.setBounds(10,290,100,20);
        pw.setBounds(110,290,200,20);

        l8.setBounds(10,330,100,20);
        t7.setBounds(110,330,200,20);

        b1.setBounds(30,500,500,100);
        b2.setBounds(600,500,500,100);
// adding all the component inside the frame
        f2.add(l1);
        f2.add(t1);
        f2.add(l2);
        f2.add(t2);
        f2.add(l3);
        f2.add(t3);
        f2.add(l4);
        f2.add(c);
        f2.add(c2);
        f2.add(c3);
        f2.add(bgi);

//.. to select  day of birthday
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");
        c.add("7");
        c.add("8");
        c.add("9");
        c.add("10");
        c.add("11");
        c.add("12");
        c.add("13");
        c.add("14");
        c.add("15");
        c.add("16");
        c.add("17");
        c.add("18");
        c.add("19");
        c.add("20");
        c.add("21");
        c.add("22");
        c.add("23");
        c.add("24");
        c.add("25");
        c.add("26");
        c.add("27");
        c.add("28");
        c.add("29");
        c.add("30");
        c.add("31");

// this for month

        c2.add("1");
        c2.add("2");
        c2.add("3");
        c2.add("4");
        c2.add("5");
        c2.add("6");
        c2.add("7");
        c2.add("8");
        c2.add("9");
        c2.add("10");
        c2.add("11");
        c2.add("12");

// this is for year
        c3.add("2000");
        c3.add("2001");
        c3.add("2002");
        c3.add("2003");
        c3.add("2004");
        c3.add("2005");
        c3.add("2006");
        c3.add("2007");
        c3.add("2008");
        c3.add("2009");
        c3.add("2010");
        c3.add("2011");
        c3.add("2012");
        c3.add("2013");
        c3.add("2014");
        c3.add("2015");
        c3.add("2016");
        c3.add("2017");
        c3.add("2018");
        c3.add("2019");

        f2.add(l5);
        o.add(r1);
        o.add(r2);
        o.add(r3);
        f2.add(r1);
        f2.add(r2);
        f2.add(r3);

        f2.add(l6);
        f2.add(t4);
        f2.add(user);
        f2.add(t5);
        f2.add(l7);
        f2.add(pw);
        f2.add(l8);
        f2.add(t7);

        f2.add(b1);
//f2.add(ok);
        f2.add(b2);

        f2.add(output);
        f2.add(cond);

// adding listener to the button

        cond.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name=t1.getText();
        String surname=t2.getText();
        String discription=t3.getText();
        String gender="male";
        if(r2.isSelected()==true)
            gender="female";
        if(r3.isSelected()==true)
            gender="other";
        String address=t4.getText();
        String users=t5.getText();
        String pass=pw.getText();
        String phone=t7.getText();

        if(e.getSource().equals(b1))
        {
            if(t1.getText().isEmpty()||(t2.getText().isEmpty())||(t3.getText().isEmpty())||(t4.getText().isEmpty())||(t5.getText().isEmpty())||(pw.getText().isEmpty())||(t7.getText().isEmpty())||(!((r1.isSelected())||(r2.isSelected())||(r3.isSelected()))))
            {
                JOptionPane.showMessageDialog(null,"Data missing");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data completed");
                GuiAccTest at=new GuiAccTest();
                at.setTitle("Bank Account Tester");
                at.setSize(600,200);
                at.setVisible(true);
                new GuiAccTest();
            }
            output.setText("name:-  "+name+"nSurname:-  "+surname+"nDiscription:-  "+discription+ "nGender:-  "+gender+"nAddress:- "+address+ "nUser Name:- "+users+ "nPass word:- "+pass+"nMobile No:-"+phone);


        }
        if(e.getSource().equals(b2))
        {
            f2.setVisible(false);
            new Banking();
        }
    }

    public class GuiAccTest extends Frame implements ActionListener
    {

        Label lab=new Label("                                                                                                                                                               ");
        Label lab1=new Label("                                                                                                                                                               ");
        TextField t[]=new TextField [4];
        Label l[]=new Label [4];
        Button but=new Button("Create Account");
        Button but1=new Button("Test Account");
        BankAccount b;
        GuiAccTest()
        {
            addWindowListener(new NewWindowAdapter());
            setLayout(new GridLayout(2,0));
            Panel p=new Panel();
            Panel p1=new Panel();
            but.addActionListener(this);
            but1.addActionListener(this);
            p.setLayout(new GridLayout(5,2));
            p1.add(lab1);
            p1.add(lab);
            l[0]=new Label("Account Number");
            l[1]=new Label("Initial Balance");
            l[2]=new Label("Deposit Amount");
            l[3]=new Label("Withdraw Amount");
            for(int i=0;i<4;i++)
            {
                t[i]=new TextField(10);
                p.add(l[i]);
                p.add(t[i]);
            }
            p.add(but);
            p.add(but1);
            but1.setVisible(false);
            l[2].setVisible(false);
            l[3].setVisible(false);
            t[2].setVisible(false);
            t[3].setVisible(false);
            add(p);
            add(p1);
        }
        String testAccount(int d_amt,int w_amt)
        {
            String msg;
            b.deposit(d_amt);
            msg="Transaction Succesful";
            try
            {
                b.withdraw(w_amt);
            }catch(FundsInsufficientException fe)
            {
                fe=new FundsInsufficientException(b.amount,w_amt);
                msg=String.valueOf(fe);
            }
            return msg;
        }
        public void actionPerformed(ActionEvent ae)
        {
            String str=ae.getActionCommand();
            if(str.equals("Create Account"))
            {
                b=new BankAccount(Integer.parseInt(t[0].getText()),Integer.parseInt(t[1].getText()));
                but1.setVisible(true);
                l[2].setVisible(true);
                l[3].setVisible(true);
                t[2].setVisible(true);
                t[3].setVisible(true);
                but.setVisible(false);
                l[0].setVisible(false);
                l[1].setVisible(false);
                t[0].setVisible(false);
                t[1].setVisible(false);
                lab1.setText("Account : "+b.accnum+", Current Balance : "+b.amount);
                return;
            }
            else
            {
                lab.setText(testAccount(Integer.parseInt(t[2].getText()),Integer.parseInt(t[3].getText())));
                lab1.setText("Account : "+b.accnum+", Current Balance : "+b.amount);
            }
        }
    }
    class NewWindowAdapter extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }
    class BankAccount
    {
        int accnum;
        int amount;
        BankAccount(int num,int amt)
        {
            accnum=num;
            amount=amt;
        }
        public void deposit(int amt)
        {
            amount=amount+amt;
        }
        public void withdraw(int amt) throws FundsInsufficientException
        {
            if(amt>amount)
                throw new FundsInsufficientException(amount,amt);
            else
                amount=amount-amt;
        }
    }
    class FundsInsufficientException extends Exception
    {
        int balance;
        int withdraw_amount;
        FundsInsufficientException(int bal,int w_amt)
        {
            balance=bal;
            withdraw_amount=w_amt;
        }
        public String toString()
        {
            return "Your withdraw amount ("+withdraw_amount+") is greater than the balance ("+balance+"). No withdrawal was recorded.";
        }
    }
}
