package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DBMSStudent extends JFrame {

    JPanel contentPanel;

    DBMSStudent() {

        setTitle("DBMS Questions");

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);

        // 🔷 Banner Image (same as CN)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/books.jpg"));
        Image img = icon.getImage().getScaledInstance(1920, 500, Image.SCALE_SMOOTH);
        JLabel banner = new JLabel(new ImageIcon(img));
        banner.setBounds(0, 0, 1920, 500);
        contentPanel.add(banner);
        
        JButton back = new JButton("Back");
        back.setBounds(1750,600,95,45);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.PINK);
        contentPanel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   setVisible(false);
                   //new Student2();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        // 🔷 Heading on Banner
        JLabel heading = new JLabel("Important DBMS Questions");
        heading.setFont(new Font("Tahoma", Font.BOLD, 40));
        heading.setForeground(Color.WHITE);
        heading.setBounds(650, 40, 1200, 50);
        banner.add(heading);

        // 🔷 Load Questions from DB
        loadQuestions();

        // 🔷 Scroll Pane
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 1920, 1080);

        add(scrollPane);

        setSize(1940, 1145);
        setLayout(null);
        setVisible(true);
    }

    // 🔷 Fetch Data
    void loadQuestions() {

        int y = 550; // start below banner

        try {
            Con c = new Con();

            // 🔥 latest questions first (recommended)
            ResultSet rs = c.statement.executeQuery(
                "SELECT * FROM dbms_questions ORDER BY id DESC"
            );

            while (rs.next()) {
                String q = rs.getString("question");
                String a = rs.getString("answer");

                y = addBlock(q, a, y);
            }

            contentPanel.setPreferredSize(new Dimension(1920, y + 200));
            contentPanel.revalidate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔷 UI Card for Each Question
    int addBlock(String question, String answer, int y) {

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBounds(200, y, 1500, 160);
        card.setBackground(new Color(240, 248, 255));
        card.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));

        JLabel q = new JLabel("<html><b>" + question + "</b></html>");
        q.setFont(new Font("Tahoma", Font.BOLD, 20));
        q.setBounds(20, 10, 1400, 30);
        card.add(q);

        JLabel a = new JLabel("<html>" + answer + "</html>");
        a.setFont(new Font("Tahoma", Font.PLAIN, 16));
        a.setBounds(20, 50, 1400, 80);
        card.add(a);

        contentPanel.add(card);

        return y + 180; // next position
    }

    public static void main(String[] args) {
        new DBMSStudent();
    }
}