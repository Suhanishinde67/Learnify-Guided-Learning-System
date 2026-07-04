package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.Pattern;

public class Signup extends JFrame implements ActionListener {

    JButton signupBtn, backBtn;
    JTextField usernameField, emailField, phoneField;
    JPasswordField passwordField;

    Signup() {
        setTitle("Interview Analytics System - Signup");
        setSize(1950, 1160);
        setLocationRelativeTo(null);
        setLayout(null);

        // 🔹 BACKGROUND IMAGE
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/books_on_table.jpg"));
        Image bgImg = bgIcon.getImage().getScaledInstance(1950, 1160, Image.SCALE_DEFAULT);
        JLabel background = new JLabel(new ImageIcon(bgImg));
        background.setBounds(0, 0, 1950, 1160);
        add(background);

        // 🔹 CENTER PANEL
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(700, 200, 500, 600);
        panel.setBackground(new Color(0, 0, 0, 180));
        background.add(panel);

        // 🔹 HEADING
        JLabel heading = new JLabel("SIGN UP");
        heading.setBounds(180, 30, 200, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        panel.add(heading);

        // 🔹 USERNAME
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(70, 100, 300, 25);
        userLabel.setForeground(Color.WHITE);
        panel.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(70, 125, 350, 40);
        panel.add(usernameField);

        // 🔹 EMAIL
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(70, 180, 300, 25);
        emailLabel.setForeground(Color.WHITE);
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(70, 205, 350, 40);
        panel.add(emailField);

        // 🔹 PHONE
        JLabel phoneLabel = new JLabel("Phone Number");
        phoneLabel.setBounds(70, 260, 300, 25);
        phoneLabel.setForeground(Color.WHITE);
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(70, 285, 350, 40);
        panel.add(phoneField);

        // 🔹 PASSWORD
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(70, 340, 300, 25);
        passLabel.setForeground(Color.WHITE);
        panel.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(70, 365, 350, 40);
        panel.add(passwordField);

        // 🔹 SIGNUP BUTTON
        signupBtn = new JButton("Sign Up");
        signupBtn.setBounds(70, 450, 150, 40);
        signupBtn.setBackground(new Color(22, 99, 54));
        signupBtn.setForeground(Color.WHITE);
        signupBtn.addActionListener(this);
        panel.add(signupBtn);

        // 🔹 BACK BUTTON
        backBtn = new JButton("Back");
        backBtn.setBounds(270, 450, 150, 40);
        backBtn.setBackground(Color.GRAY);
        backBtn.setForeground(Color.WHITE);
        backBtn.addActionListener(this);
        panel.add(backBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == signupBtn) {
            try {
                String user = usernameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String pass = new String(passwordField.getPassword());

                // 🔴 EMPTY CHECK
                if (user.isEmpty() || email.isEmpty() || phone.isEmpty() || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields are required");
                    return;
                }

                // 🔴 USERNAME VALIDATION
                if (!Pattern.matches("^[A-Za-z][A-Za-z0-9_]{2,14}$", user)) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid Username!\n\nRules:\n" +
                            "- Must start with a letter\n" +
                            "- Only letters, numbers, underscore\n" +
                            "- Length: 3 to 15 characters\n" +
                            "- No spaces allowed");
                    return;
                }

                // 🔴 EMAIL VALIDATION
                if (!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
                    JOptionPane.showMessageDialog(null, "Invalid Email Format");
                    return;
                }

                // 🔴 PHONE VALIDATION
                if (!Pattern.matches("\\d{10}", phone)) {
                    JOptionPane.showMessageDialog(null, "Phone number must be 10 digits");
                    return;
                }

                // 🔹 DATABASE CONNECTION
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/interview",
                        "root",
                        "$uhan!@3110"
                );

                String query = "INSERT INTO users(username, email, phone, password) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(query);

                pstmt.setString(1, user);
                pstmt.setString(2, email);
                pstmt.setString(3, phone);
                pstmt.setString(4, pass);

                int result = pstmt.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Signup Successful!");
                    new Home();
                    setVisible(false);
                }

                conn.close();

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Username or Email already exists");
            }

        } else if (e.getSource() == backBtn) {
            new Home();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}