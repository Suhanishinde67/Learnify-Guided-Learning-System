package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CPPScore extends JFrame {

    CPPScore(String name, int score) {

        setSize(1940, 1145);
        setLocation(0, 0);
        setLayout(null);

        // 🔹 BACKGROUND IMAGE
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image bgImg = bgIcon.getImage().getScaledInstance(1940, 1145, Image.SCALE_DEFAULT);
        JLabel background = new JLabel(new ImageIcon(bgImg));
        background.setBounds(0, 0, 1940, 1145);
        add(background);

        // 🔹 SCORE IMAGE
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(600, 450, 300, 250);

        // 🔹 HEADING
        JLabel heading = new JLabel("YOU HAVE COMPLETED C++ MCQ TEST SUCCESSFULLY!!!");
        heading.setBounds(300, 300, 1400, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 42));
        heading.setForeground(Color.PINK);

        // 🔹 SCORE LABEL
        JLabel scoreLabel = new JLabel("Your Score is " + score);
        scoreLabel.setBounds(950, 500, 400, 40);
        scoreLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
        scoreLabel.setForeground(Color.BLACK);

        // 🔹 EXIT BUTTON
        JButton exit = new JButton("EXIT");
        exit.setBounds(1010, 600, 120, 40);
        exit.setBackground(new Color(22, 99, 54));
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Tahoma", Font.BOLD, 18));

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //new StartLearning2(); // same flow as your project
                setVisible(false);
            }
        });

        // 🔹 ADD COMPONENTS TO BACKGROUND
        background.add(image);
        background.add(heading);
        background.add(scoreLabel);
        background.add(exit);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CPPScore("User", 0);
    }
}