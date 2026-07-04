package interview.analytics.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ratings extends JFrame implements ActionListener {
    JTextField t2,t3;
    
    JButton b1,b2;
    Ratings(){

        setTitle("Feedback");
        JPanel panel = new JPanel();
        panel.setBounds(5,5,1090,590);
        panel.setBackground(new Color(245, 235, 255));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("YOUR FEEDBACK HELPS US..");
        l1.setBounds(250,25,800,33);
        l1.setFont(new Font("Tahoma", Font.BOLD,40));
        l1.setForeground(Color.PINK);
        panel.add(l1);

        JLabel l2 = new JLabel("Would you like to share some feedback??");
        l2.setBounds(330,120,550,43);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        panel.add(l2);
      
        t2 =new JTextField();
        t2.setBounds(330,170,420,90);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(255,255,255));
        panel.add(t2);
        
        
        JLabel l3 = new JLabel("What can we do more to improve your experience??");
        l3.setBounds(280,300,550,43);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        panel.add(l3);
        
        t3 =new JTextField();
        t3.setBounds(330,350,420,90);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        t3.setForeground(Color.BLACK);
        t3.setBackground(new Color(255,255,255));
        panel.add(t3);
        
        
        b1 = new JButton("Add");
        b1.setBounds(390,500,111,33);
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(585,500,111,33);
        b2.setBackground(Color.PINK);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        panel.add(b2);

        //setUndecorated(true);
        setLocation(665,215);
        setLayout(null);
        setSize(1100,600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            try{
                Con c = new Con();
                String text1 = t2.getText();
                String text2 = t3.getText();
                
                String q = "insert into ratings values('"+text1+"', '"+text2+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Feedback Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Ratings();
    }
}
