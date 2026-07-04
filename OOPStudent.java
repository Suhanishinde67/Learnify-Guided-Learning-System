package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class OOPStudent extends JFrame {

    JPanel contentPanel;

    OOPStudent() {

        setTitle("OOPs Questions");

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setBackground(Color.WHITE);

        // 🔷 Banner
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

        back.addActionListener(e -> {
            setVisible(false);
            //new Student2();
        });

        JLabel heading = new JLabel("Important OOPs Questions");
        heading.setFont(new Font("Tahoma", Font.BOLD, 40));
        heading.setForeground(Color.WHITE);
        heading.setBounds(650, 40, 1200, 50);
        banner.add(heading);

        loadQuestions();

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 1920, 1080);
        add(scrollPane);

        setSize(1940, 1145);
        setLayout(null);
        setVisible(true);
    }

    void loadQuestions() {

        int y = 550;

        try {
            Con c = new Con();

            ResultSet rs = c.statement.executeQuery(
                "SELECT * FROM oops_questions ORDER BY id DESC"
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

        return y + 180;
    }

    public static void main(String[] args) {
        new OOPStudent();
    }
}