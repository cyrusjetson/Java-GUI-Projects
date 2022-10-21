package com.today;

import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.sql.*;
import javax.swing.*;
public class carsales extends JFrame implements ActionListener
{
    static JLabel label1,label2,label3,sep;
    static JButton sign,showall,create,close,clear,delete;
    static JTextField txtA1;
    static JTextField txtA2;
    static Connection con;
    static Statement st1,st2,st3;
    static ResultSet rs1,rs2;
    int numd;
    String numf;
    int nume;
    public carsales()
    {
        super("Car showroom System");
        setLayout(new FlowLayout());
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/lab","root","");
            st1=con.createStatement();
            rs1=st1.executeQuery("select * from employee");
        }
        catch(Exception e)
        {
            System.out.println("there was some error in establishing connection : "+e);
        }
        sep = new JLabel("Existing User Signin  :  ");
        add(sep);
        label1 = new JLabel(" Employee ID : ");
        add(label1);
        txtA1 = new JTextField(15);
        add(txtA1);
        label2 = new JLabel("        Name :       ");
        add(label2);
        txtA2 = new JTextField(15);
        add(txtA2);
        sep = new JLabel("                                                                                           ");
        add(sep);
        sep = new JLabel("                                    ");
        add(sep);
        sep = new JLabel("New User Signin  :  ");
        add(sep);
        create=new JButton("Insert new employee detail");
        add(create);
        sep = new JLabel("                                                                                          ");
        add(sep);
        sign=new JButton("SIGN");
        add(sign);
        sep = new JLabel("                                                    ");
        add(sep);
        clear=new JButton("CLEAR");
        add(clear);
        sep = new JLabel("                                                                                      ");
        add(sep);
        delete=new JButton("DELETE");
        add(delete);
        sep = new JLabel("                                                                                      ");
        add(sep);
        close=new JButton("CLOSE");
        add(close);
        sep = new JLabel("                                                                                      ");
        add(sep);
        showall=new JButton("Show ALL");
        add(showall);
        ImageIcon bg=new ImageIcon("carr.jpg");
        JLabel bgi=new JLabel(" ",bg,JLabel.CENTER);
        bgi.setBounds(500,0,5000,500);
        add(bgi);
        create.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        close.addActionListener(this);
        sign.addActionListener(this);
        showall.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==create)
        {
            String stra = JOptionPane.showInputDialog(null,"Please enter the Name");
            String strb = JOptionPane.showInputDialog(null,"Please enter the id");
            String strc =JOptionPane.showInputDialog(null,"Please enter age");
            String strd =JOptionPane.showInputDialog(null,"Please enter experience");
            String stre =JOptionPane.showInputDialog(null,"Please enter salary");
            if(stra==null || strb==null || strc==null || strd==null || stre==null)
            {
                JOptionPane.showMessageDialog(null," Either any one or both the values were left blank");
                create.setEnabled(true);
                delete.setEnabled(false);
                sign.setEnabled(true);
                showall.setEnabled(true);
            }
            else
            {
                try
                {
                    st2=con.createStatement();
                    String rr="insert into employee values("+strb+",'"+stra+"',"+strc+","+strd+","+stre+")";
                    System.out.println("Hai   "+rr+"    Bye");
                    st2.executeUpdate(rr);
                    st2.close();
                    JOptionPane.showMessageDialog(null,"Employee detail inserted Successfully");
                    txtA1.setText(strb);
                    txtA2.setText(stra);
                    showall.setEnabled(true);
                }
                catch(Exception e2)
                {
                    JOptionPane.showMessageDialog(null," There is already a user with same ACCOUNT NUMBER ,Give another ACCOUNT NUMBER ");
                }
                delete.setEnabled(true);
                create.setEnabled(true);
                sign.setEnabled(true);
                showall.setEnabled(true);
            }
        }

        else if(e.getSource()==sign)
        {
            String num=txtA1.getText();
            try
            {
                st1.close();
                st1=con.createStatement();
                rs1=st1.executeQuery("Select * from employee where id ="+num);
                rs1.next();
                txtA1.setText(rs1.getString("id"));
                txtA2.setText(rs1.getString("name"));
                delete.setEnabled(true);
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null,"Invalid employee Number");
            }
            delete.setEnabled(true);
            create.setEnabled(false);
            showall.setEnabled(true);
        }
        else if (e.getSource()==showall)
        {
            String num=txtA1.getText();
            try
            {
                st2=con.createStatement();
                rs2=st2.executeQuery("Select * from employee where id ="+num);
                rs2.next();
                String a=rs1.getString("id");
                String b=rs1.getString("name");
                String c=rs1.getString("age");
                String d=rs1.getString("experience");
                numf="id: "+a+"  name: "+b+"  age: "+c+"  Experience: "+d;
                JOptionPane.showMessageDialog(null,"Details: "+numf);
                st2.close();
                showall.setEnabled(true);
            }
            catch(Exception e3)
            {
                JOptionPane.showMessageDialog(null,"Details are not available");
            }
        }
        else if(e.getSource()==delete)
        {
            try
            {
                st2=con.createStatement();
                System.out.println(txtA1.getText());
                String num=txtA1.getText();
                String kk="delete from employee where id="+num;
                System.out.println("Hai"+kk+"Bye");
                st2.executeUpdate(kk);
                st2.close();
                System.out.println("Hai"+kk+"Bye");
                JOptionPane.showMessageDialog(null,"Details deleted Successfully");
            }
            catch(Exception e2)
            {
                JOptionPane.showMessageDialog(null,"Details are not deleted");
            }
        }
        else if(e.getSource()==clear)
        {
            txtA1.setText("");
            txtA2.setText("");
            delete.setEnabled(false);
            create.setEnabled(true);
            sign.setEnabled(true);
        }
        else if(e.getSource()==close)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        carsales obj = new carsales();
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(420,420);
        obj.setVisible(true);
    }
}
