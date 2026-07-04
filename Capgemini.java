package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capgemini extends JFrame {

    Capgemini() {

        setTitle("Capgemini Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use your own image: capgemini.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/capgemini.jpg"));
        Image img = icon.getImage().getScaledInstance(1900, 500, Image.SCALE_SMOOTH);
        JLabel banner = new JLabel(new ImageIcon(img));
        banner.setBounds(0, 0, 1900, 500);
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
        y = addSectionTitle(contentPanel, "ABOUT CAPGEMINI", y);

        y = addBlock(contentPanel, "Overview",
                "Capgemini is a global leader in consulting, technology services, and digital transformation.<br>" +
                "Founded in 1967 and headquartered in Paris, France.<br>" +
                "Operates in 50+ countries with strong presence in IT services.<br><br>" +
                "<b>Hiring Roles:</b> Analyst, Software Engineer, Consultant",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• Cloud & Infrastructure Services<br>" +
                "• AI & Data Analytics<br>" +
                "• Cybersecurity<br>" +
                "• Digital Transformation",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• Generative AI Solutions<br>" +
                "• Sustainable Technology<br>" +
                "• Intelligent Industry & Automation",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. Aptitude Test (Quant + Logical)<br>" +
                "2. Pseudocode / Technical MCQs<br>" +
                "3. Coding Round (1–2 questions)<br>" +
                "4. Technical Interview<br>" +
                "5. HR Interview",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• OOPS Concepts<br>" +
                "• SQL (Joins, Queries)<br>" +
                "• DSA (Arrays, Strings)<br>" +
                "• Pseudocode Practice",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why Capgemini?<br>" +
                "• Strengths & Weaknesses<br>" +
                "• Relocation & Work Flexibility",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Inheritance?<br>" +
                "<b>A:</b> Mechanism where one class acquires properties of another.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> What are Joins?<br>" +
                "<b>A:</b> Used to combine rows from multiple tables.",
                y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> Reverse a String?<br>" +
                "<b>A:</b> Use loop or built-in functions.",
                y);

        y = addBlock(contentPanel, "Pseudocode",
                "<b>Q:</b> What is pseudocode?<br>" +
                "<b>A:</b> Step-by-step logic written in simple English-like format.",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> What is Deadlock?<br>" +
                "<b>A:</b> Situation where processes wait indefinitely for resources.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Practice aptitude daily<br>" +
                "• Prepare pseudocode<br>" +
                "• Revise core concepts<br>" +
                "• Stay confident",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore aptitude<br>" +
                "• Don’t fake knowledge<br>" +
                "• Don’t panic in interviews<br>" +
                "• Avoid guessing blindly",
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
        new Capgemini();
    }
}