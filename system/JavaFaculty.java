package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class JavaFaculty extends JFrame implements ActionListener {

    JTextArea questionArea, answerArea;
    JButton submit, back;

    JavaFaculty() {

        setTitle("Upload Java Question");
        setSize(1200, 700);
        setLayout(null);
        setLocation(600, 200);
        getContentPane().setBackground(new Color(255, 245, 247));

        JLabel heading = new JLabel("UPLOAD JAVA QUESTIONS");
        heading.setBounds(300, 20, 750, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 40));
        heading.setForeground(Color.PINK);
        add(heading);

        JLabel qLabel = new JLabel("Enter Question:");
        qLabel.setBounds(270, 150, 300, 30);
        qLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(qLabel);

        questionArea = new JTextArea();
        questionArea.setBounds(270, 180, 580, 100);
        questionArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(questionArea);

        JLabel aLabel = new JLabel("Enter Answer:");
        aLabel.setBounds(270, 330, 300, 30);
        aLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(aLabel);

        answerArea = new JTextArea();
        answerArea.setBounds(270, 360, 580, 100);
        answerArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(answerArea);

        submit = new JButton("Submit");
        submit.setBounds(320, 500, 150, 40);
        submit.setBackground(Color.PINK);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("Back");
        back.setBounds(600, 500, 150, 40);
        back.setBackground(Color.PINK);
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String q = questionArea.getText().trim();
            String a = answerArea.getText().trim();

            if (q.isEmpty() || a.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fields cannot be empty!");
                return;
            }

            if (q.length() < 5 || a.length() < 10) {
                JOptionPane.showMessageDialog(null, "Enter proper question and answer!");
                return;
            }

            try {
                Con c = new Con();

                String query = "INSERT INTO java_questions (question, answer) VALUES (?, ?)";
                PreparedStatement ps = c.connection.prepareStatement(query);

                ps.setString(1, q);
                ps.setString(2, a);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Question Added Successfully!");

                questionArea.setText("");
                answerArea.setText("");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new JavaFaculty();
    }
}