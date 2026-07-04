package interview.analytics.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FacultyInfo extends JFrame {
    FacultyInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,1190,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,50,1150,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            Con c = new Con();
            String driverSQL = "select * from faculty";
            ResultSet resultSet = c.statement.executeQuery(driverSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel dname = new JLabel("NAME");
        dname.setBounds(30,11,90,19);
        dname.setForeground(Color.WHITE);
        dname.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(dname);

        JLabel id = new JLabel("AGE");
        id.setBounds(150,11,70,19);
        id.setForeground(Color.WHITE);
        id.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(id);

        JLabel Age = new JLabel("GENDER");
        Age.setBounds(240,11,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Age);

        JLabel name = new JLabel("DEGREE");
        name.setBounds(470,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("EMAIL");
        gender.setBounds(620,11,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("PHONE");
        country.setBounds(730,11,70,19);
        country.setForeground(Color.WHITE);
        country.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(country);

        JLabel phone = new JLabel("ID");
        phone.setBounds(370,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel gmail = new JLabel("LOCATION");
        gmail.setBounds(1030,11,80,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);
        
        JLabel status = new JLabel("SALARY");
        status.setBounds(830,11,70,19);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(status);
        
        JLabel location = new JLabel("STATUS");
        location.setBounds(930,11,70,19);
        location.setForeground(Color.WHITE);
        location.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(location);
        
        setUndecorated(true);
        setLayout(null);
        setLocation(500,295);
        setSize(1200,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FacultyInfo();
    }
}

