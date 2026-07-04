package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class StudentLogin extends JFrame implements ActionListener {

    JButton loginBtn, backBtn;
    JTextField usernameField;
    JPasswordField passwordField;

    StudentLogin() {
        setTitle("Interview Analytics System - Student Login");
        setSize(1950, 1160);
        setLocationRelativeTo(null);
        setLayout(null);

        // 🔹 BACKGROUND IMAGE
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/books_on_table.jpg"));
        Image bgImg = bgIcon.getImage().getScaledInstance(1950, 1160, Image.SCALE_DEFAULT);
        JLabel background = new JLabel(new ImageIcon(bgImg));
        background.setBounds(0, 0, 1950, 1160);
        add(background);

        // 🔹 LOGIN PANEL (CENTER CARD)
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(700, 250, 500, 500);
        panel.setBackground(new Color(0, 0, 0, 180)); // transparent black
        background.add(panel);

        // 🔹 HEADING
        JLabel heading = new JLabel("STUDENT LOGIN");
        heading.setBounds(120, 40, 300, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        panel.add(heading);

        // 🔹 USERNAME LABEL
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(80, 120, 300, 30);
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        userLabel.setForeground(Color.WHITE);
        panel.add(userLabel);

        // 🔹 USERNAME FIELD
        usernameField = new JTextField();
        usernameField.setBounds(80, 150, 320, 40);
        usernameField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel.add(usernameField);

        // 🔹 PASSWORD LABEL
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(80, 210, 300, 30);
        passLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passLabel.setForeground(Color.WHITE);
        panel.add(passLabel);

        // 🔹 PASSWORD FIELD
        passwordField = new JPasswordField();
        passwordField.setBounds(80, 240, 320, 40);
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panel.add(passwordField);

        // 🔹 LOGIN BUTTON
        loginBtn = new JButton("Login");
        loginBtn.setBounds(80, 320, 140, 40);
        loginBtn.setBackground(new Color(22, 99, 54));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
        loginBtn.addActionListener(this);
        panel.add(loginBtn);

        // 🔹 BACK BUTTON
        backBtn = new JButton("Back");
        backBtn.setBounds(260, 320, 140, 40);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginBtn) {
            try {
                Con c = new Con();
                String user = usernameField.getText();
                String pass = passwordField.getText();

                String q = "SELECT * FROM login WHERE username = '" + user + "' AND password = '" + pass + "'";
                ResultSet rs = c.statement.executeQuery(q);

                if (rs.next()) {
                    new Student();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == backBtn) {
            new Home();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentLogin();
    }
}