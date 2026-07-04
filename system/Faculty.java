package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import test.Main;



public class Faculty extends JFrame implements ActionListener {

    JButton  add_sign, add_Ratings, add_Ride, add_maps, add_sign2, add_Ratings2, add_Ride2, add_maps2 , logout, back;
    Faculty(){
      
        add_sign = new JButton( "ADD DBMS QUESTIONS");
        add_sign.setBounds(250,130,300,30);
        add_sign.setBackground(Color.BLACK);
        add_sign.setForeground(Color.PINK);
        add_sign.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_sign.addActionListener(this);
        add(add_sign);

        add_Ride = new JButton( "ADD FUNDAMENTAL QUESTIONS");
        add_Ride.setBounds(250,230,300,30);
        add_Ride.setBackground(Color.BLACK);
        add_Ride.setForeground(Color.PINK);
        add_Ride.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ride.addActionListener(this);
        add(add_Ride);

        add_maps = new JButton( "ADD CN QUESTIONS");
        add_maps.setBounds(250,330,300,30);
        add_maps.setBackground(Color.BLACK);
        add_maps.setForeground(Color.PINK);
        add_maps.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_maps.addActionListener(this);
        add(add_maps);
        
        add_Ratings = new JButton( "ADD OS QUESTIONS");
        add_Ratings.setBounds(250,430,300,30);
        add_Ratings.setBackground(Color.BLACK);
        add_Ratings.setForeground(Color.PINK);
        add_Ratings.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ratings.addActionListener(this);
        add(add_Ratings);
        
        add_sign2 = new JButton( "ADD OOP QUESTIONS");
        add_sign2.setBounds(250,530,300,30);
        add_sign2.setBackground(Color.BLACK);
        add_sign2.setForeground(Color.PINK);
        add_sign2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_sign2.addActionListener(this);
        add(add_sign2);

        add_Ride2 = new JButton( "JAVA QUESTION BANK");
        add_Ride2.setBounds(250,630,300,30);
        add_Ride2.setBackground(Color.BLACK);
        add_Ride2.setForeground(Color.PINK);
        add_Ride2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ride2.addActionListener(this);
        add(add_Ride2);

        add_maps2 = new JButton( "PYTHON QUESTION BANK");
        add_maps2.setBounds(250,730,300,30);
        add_maps2.setBackground(Color.BLACK);
        add_maps2.setForeground(Color.PINK);
        add_maps2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_maps2.addActionListener(this);
        add(add_maps2);
        
        add_Ratings2 = new JButton( "WEB TECH.QUESTION BANK");
        add_Ratings2.setBounds(250,830,300,30);
        add_Ratings2.setBackground(Color.BLACK);
        add_Ratings2.setForeground(Color.PINK);
        add_Ratings2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add_Ratings2.addActionListener(this);
        add(add_Ratings2);

        logout = new JButton( "Logout");
        logout.setBounds(265,940,95,30);
        logout.setBackground(Color.PINK);
        logout.setForeground(Color.BLACK);
        logout.setFont(new Font("Tahoma", Font.BOLD, 15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton( "Back");
        back.setBounds(430,940,95,30);
        back.setBackground(Color.PINK);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        add(back);

        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,540,120,120);
        add(label2);

        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image3 = imageIcon4.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon14 = new ImageIcon(image3);
        JLabel label4 = new JLabel(imageIcon14);
        label4.setBounds(70,730,120,120);
        add(label4);
        
        
        ImageIcon imageIcon5 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image image4 = imageIcon5.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon15 = new ImageIcon(image4);
        JLabel label5 = new JLabel(imageIcon15);
        label5.setBounds(70,130,120,120);
        add(label5);
        
        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/girl_clock.gif"));
        Image image2 = imageIcon3.getImage().getScaledInstance(550,550, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(1080,260,550,550);
        add(label3);
       
        
        
        getContentPane().setBackground(new Color(255, 245, 247));
        setLayout(null);
        setSize(1920,1145);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Ride){
            new CFFaculty();
        }else if (e.getSource() == add_sign) {
            new DBMSFaculty();
        }else if (e.getSource() == add_sign2) {
            new OOPFaculty();
        }else if (e.getSource() == add_maps) {
            new CNFaculty();           
        } else if (e.getSource() == add_maps2) {
            new PythonFaculty();           
        } else if (e.getSource() == add_Ride2) {
            new JavaFaculty();           
        } else if (e.getSource() ==  add_Ratings) {
            new OSFaculty();
        } else if (e.getSource() ==  add_Ratings2) {
            new WebTechFaculty();
        } else if (e.getSource() == logout){
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Faculty();
    }
}
