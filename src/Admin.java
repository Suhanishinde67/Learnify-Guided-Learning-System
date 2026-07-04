package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
    Admin(){
        super("Interview Analytics System");
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(320,5,1615,1080);
        panel.setBackground(new Color(245, 235, 255));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,310,1080);
        panel1.setBackground(new Color(255, 245, 247));
        add(panel1);

        JLabel titleLabel = new JLabel("WELCOME ADMIN!!");
        titleLabel.setBounds(570, 24, 455, 45);
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
        titleLabel.setForeground(Color.BLACK);
        panel.add(titleLabel);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(240,240, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(10,530,260,780);
        panel1.add(label1);
        
        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/teamwork.gif"));
        Image image2 = imageIcon3.getImage().getScaledInstance(550,550, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(450,250,550,550);
        panel.add(label3);

        JButton btnNCF = new JButton("NEW USER");
        btnNCF.setBounds(30,30,200,45);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.PINK);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   new AddStudent();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("SEARCH FACULTY");
        btnRoom.setBounds(30,380,200,45);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.PINK);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new SearchFaculty();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("STUDENT INFO.");
        btnDepartment.setBounds(30,240,200,45);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.PINK);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new StudentInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("ADD STUDENT.");
        btnAEI.setBounds(30,100,200,45);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.PINK);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new AddStudent();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("ADD FACULTY");
        btnCI.setBounds(30,170,200,45);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.PINK);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new AddFaculty();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton btnCO = new JButton("GO TO DASHBOARD");
        btnCO.setBounds(30,450,200,45);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.PINK);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("GO TO HOME");
        btnUC.setBounds(30,520,200,45);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.PINK);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Home();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("FACULTY INFO.");
        btnURS.setBounds(30,310,200,45);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.PINK);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new FacultyInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton logout = new JButton("Logout");
        logout.setBounds(30,600,95,45);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.PINK);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  System.exit(500);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,600,95,45);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.PINK);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   setVisible(false);
                   new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1920,1140);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Admin();
    }
}

