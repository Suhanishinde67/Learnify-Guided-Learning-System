package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import test.Main;



public class Student extends JFrame implements ActionListener {

    JButton  add_sign, add_Ratings, add_Ride, add_maps, logout, back;
    Student(){
      
        add_sign = new JButton( "START LEARNING");
        add_sign.setBounds(250,230,300,30);
        add_sign.setBackground(Color.BLACK);
        add_sign.setForeground(Color.PINK);
        add_sign.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_sign.addActionListener(this);
        add(add_sign);

        add_Ride = new JButton( "LEETCODE QUESTIONS");
        add_Ride.setBounds(250,380,300,30);
        add_Ride.setBackground(Color.BLACK);
        add_Ride.setForeground(Color.PINK);
        add_Ride.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ride.addActionListener(this);
        add(add_Ride);

        add_maps = new JButton( "MCQ'S TEST");
        add_maps.setBounds(250,530,300,30);
        add_maps.setBackground(Color.BLACK);
        add_maps.setForeground(Color.PINK);
        add_maps.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_maps.addActionListener(this);
        add(add_maps);
        
        add_Ratings = new JButton( "FEEDBACK");
        add_Ratings.setBounds(250,690,300,30);
        add_Ratings.setBackground(Color.BLACK);
        add_Ratings.setForeground(Color.PINK);
        add_Ratings.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ratings.addActionListener(this);
        add(add_Ratings);

        logout = new JButton( "Logout");
        logout.setBounds(80,855,95,30);
        logout.setBackground(Color.PINK);
        logout.setForeground(Color.BLACK);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton( "Back");
        back.setBounds(250,855,95,30);
        back.setBackground(Color.PINK);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);

        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,100,100);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,500,100,100);
        add(label2);

        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image3 = imageIcon4.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon14 = new ImageIcon(image3);
        JLabel label4 = new JLabel(imageIcon14);
        label4.setBounds(70,660,120,120);
        add(label4);
        
        
        ImageIcon imageIcon5 = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image4 = imageIcon5.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon15 = new ImageIcon(image4);
        JLabel label5 = new JLabel(imageIcon15);
        label5.setBounds(70,160,120,120);
        add(label5);

        getContentPane().setBackground(new Color(255, 245, 247));
        setLayout(null);
        setSize(1920,1145);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Ride){
            new Top100Codes();
        }else if (e.getSource() == add_sign) {
            new StartLearning2();
        }else if (e.getSource() == add_maps) {
            //new BookRide2();           
        } else if (e.getSource() ==  add_Ratings) {
            new Ratings();
        } else if (e.getSource() == logout){
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Student();
    }
}
