package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TCS extends JFrame {

    TCS() {

        setTitle("TCS Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use icon/tcs.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/TCS2.jpg"));
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
        y = addSectionTitle(contentPanel, "ABOUT TCS", y);

        y = addBlock(contentPanel, "Overview",
                "Tata Consultancy Services (TCS) is India's largest IT services company.<br>" +
                "Part of the Tata Group, founded in 1968.<br>" +
                "Provides IT services, consulting, and business solutions globally.<br><br>" +
                "<b>Hiring Categories:</b> NQT, Ninja, Digital",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• IT Services & Consulting<br>" +
                "• Cloud & Digital Transformation<br>" +
                "• Cybersecurity<br>" +
                "• Enterprise Solutions",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• AI & Automation<br>" +
                "• Cloud-first strategy<br>" +
                "• Digital business transformation",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. TCS NQT (Aptitude + Reasoning)<br>" +
                "2. Coding Test<br>" +
                "3. Technical Interview<br>" +
                "4. HR Interview",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• OOPS Concepts<br>" +
                "• Basic DSA<br>" +
                "• SQL Basics<br>" +
                "• OS & Networking Basics",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why TCS?<br>" +
                "• Willing to relocate?<br>" +
                "• Strengths & weaknesses",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Inheritance?<br>" +
                "<b>A:</b> One class acquiring properties of another.",
                y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> What is an Array?<br>" +
                "<b>A:</b> Collection of elements stored in contiguous memory.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> What is a JOIN?<br>" +
                "<b>A:</b> Used to combine data from multiple tables.",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> What is a Process?<br>" +
                "<b>A:</b> Program in execution.",
                y);

        y = addBlock(contentPanel, "Networking",
                "<b>Q:</b> What is IP Address?<br>" +
                "<b>A:</b> Unique identifier for devices on a network.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Practice aptitude regularly<br>" +
                "• Revise fundamentals<br>" +
                "• Be confident in interviews<br>" +
                "• Prepare projects well",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore aptitude<br>" +
                "• Don’t fake skills<br>" +
                "• Don’t panic<br>" +
                "• Avoid poor communication",
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
        new TCS();
    }
}