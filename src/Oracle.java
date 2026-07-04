package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oracle extends JFrame {

    Oracle() {

        setTitle("Oracle Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use icon/oracle.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/oracle.jpg"));
        Image img = icon.getImage().getScaledInstance(1920, 500, Image.SCALE_SMOOTH);
        JLabel banner = new JLabel(new ImageIcon(img));
        banner.setBounds(0, 0, 1920, 500);
        banner.setLayout(null);
        contentPanel.add(banner);
        
        JButton back = new JButton("Back");
        back.setBounds(1760,545,95,45);
        back.setBackground(Color.PINK);
        back.setForeground(Color.BLACK);
        contentPanel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   setVisible(false);
                   //new Student();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        int y = 550;

        // 🔶 ABOUT
        y = addSectionTitle(contentPanel, "ABOUT ORACLE", y);

        y = addBlock(contentPanel, "Overview",
                "Oracle is a global technology company known for database software and cloud solutions.<br>" +
                "Founded in 1977 and headquartered in the USA.<br>" +
                "Leader in enterprise software, cloud infrastructure, and database systems.<br><br>" +
                "<b>Hiring Roles:</b> Software Developer, Applications Engineer",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• Database Systems (Oracle DB)<br>" +
                "• Cloud Infrastructure (OCI)<br>" +
                "• Enterprise Applications<br>" +
                "• Java & Backend Systems",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• Cloud-first architecture (OCI)<br>" +
                "• AI-powered enterprise apps<br>" +
                "• Autonomous Database technology",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. Online Assessment (Coding + MCQs)<br>" +
                "2. Technical Interview (DSA + CS Fundamentals)<br>" +
                "3. Managerial / HR Round",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• Data Structures & Algorithms (VERY IMPORTANT)<br>" +
                "• DBMS (Normalization, Indexing)<br>" +
                "• OOPS Concepts<br>" +
                "• Operating System Basics",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why Oracle?<br>" +
                "• Your project explanation<br>" +
                "• Career goals",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> What is a HashMap?<br>" +
                "<b>A:</b> A data structure that stores key-value pairs using hashing.",
                y);

        y = addBlock(contentPanel, "DBMS",
                "<b>Q:</b> What is Indexing?<br>" +
                "<b>A:</b> Technique to improve database query performance.",
                y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Abstraction?<br>" +
                "<b>A:</b> Hiding implementation details and showing only functionality.",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> What is Virtual Memory?<br>" +
                "<b>A:</b> Uses disk space as an extension of RAM.",
                y);

        y = addBlock(contentPanel, "Java",
                "<b>Q:</b> Why is Java platform-independent?<br>" +
                "<b>A:</b> Because of JVM which runs bytecode on any system.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Focus heavily on DSA<br>" +
                "• Practice coding daily<br>" +
                "• Understand DBMS concepts<br>" +
                "• Explain projects clearly",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore coding practice<br>" +
                "• Don’t memorize without understanding<br>" +
                "• Don’t fake projects<br>" +
                "• Avoid weak fundamentals",
                y,
                new Color(255, 200, 200));

        // 🔷 SCROLL
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(30);
        add(scrollPane);

        setSize(1940, 1145);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // 🔷 SECTION TITLE
    private int addSectionTitle(JPanel panel, String text, int y) {
        JLabel label = new JLabel(text, JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", Font.BOLD, 20));
        label.setBounds(200, y, 1500, 40);
        panel.add(label);
        return y + 60;
    }

    // 🔷 DYNAMIC CARD
    private int addBlock(JPanel panel, String title, String content, int y) {

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(Color.BLACK);
        card.setBorder(BorderFactory.createLineBorder(new Color(220,220,220)));

        JLabel t = new JLabel(title);
        t.setForeground(new Color(255, 182, 193));
        t.setFont(new Font("Segoe UI", Font.BOLD, 20));
        t.setBounds(20, 10, 1400, 30);
        card.add(t);

        JLabel c = new JLabel("<html><div style='width:1300px;color:white'>" + content + "</div></html>");
        c.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        c.setBounds(20, 50, 1400, 10);
        card.add(c);

        int contentHeight = c.getPreferredSize().height;
        c.setBounds(20, 50, 1400, contentHeight);

        int totalHeight = contentHeight + 80;
        card.setBounds(200, y, 1500, totalHeight);

        panel.add(card);

        return y + totalHeight + 30;
    }

    // 🔷 COLORED BLOCK
    private int addColoredBlock(JPanel panel, String title, String content, int y, Color bg) {

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(bg);

        JLabel t = new JLabel(title);
        t.setFont(new Font("Segoe UI", Font.BOLD, 20));
        t.setBounds(20, 10, 1400, 30);
        card.add(t);

        JLabel c = new JLabel("<html><div style='width:1300px'>" + content + "</div></html>");
        c.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        c.setBounds(20, 50, 1400, 10);
        card.add(c);

        int contentHeight = c.getPreferredSize().height;
        c.setBounds(20, 50, 1400, contentHeight);

        int totalHeight = contentHeight + 80;
        card.setBounds(200, y, 1500, totalHeight);

        panel.add(card);

        return y + totalHeight + 30;
    }

    public static void main(String[] args) {
        new Oracle();
    }
}