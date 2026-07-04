package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IBM extends JFrame {

    IBM() {

        setTitle("IBM Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use icon/ibm.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/IBM2.png"));
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
        y = addSectionTitle(contentPanel, "ABOUT IBM", y);

        y = addBlock(contentPanel, "Overview",
                "IBM (International Business Machines) is a global technology and consulting company.<br>" +
                "Founded in 1911, headquartered in the USA.<br>" +
                "Known for innovation in AI, cloud computing, and enterprise solutions.<br><br>" +
                "<b>Hiring Roles:</b> Software Engineer, Associate System Engineer, Consultant",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• Artificial Intelligence (Watson)<br>" +
                "• Hybrid Cloud Computing<br>" +
                "• Cybersecurity<br>" +
                "• Enterprise Software Solutions",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• AI & Automation expansion<br>" +
                "• Hybrid Cloud platforms<br>" +
                "• Quantum Computing research",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. Online Assessment (Aptitude + Coding)<br>" +
                "2. Technical Interview<br>" +
                "3. HR Interview",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• OOPS Concepts<br>" +
                "• DSA (Arrays, Strings, Linked List)<br>" +
                "• SQL Basics<br>" +
                "• Cloud & Basics of AI",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why IBM?<br>" +
                "• Your strengths & weaknesses<br>" +
                "• Future career goals",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Abstraction?<br>" +
                "<b>A:</b> Hiding internal details and showing only functionality.",
                y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> What is a Linked List?<br>" +
                "<b>A:</b> A linear data structure where elements are connected via pointers.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> What is a Join?<br>" +
                "<b>A:</b> Combines data from multiple tables.",
                y);

        y = addBlock(contentPanel, "Cloud",
                "<b>Q:</b> What is Cloud Computing?<br>" +
                "<b>A:</b> Delivering computing services over the internet.",
                y);

        y = addBlock(contentPanel, "AI",
                "<b>Q:</b> What is Artificial Intelligence?<br>" +
                "<b>A:</b> Simulation of human intelligence in machines.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Strengthen DSA concepts<br>" +
                "• Learn basics of cloud & AI<br>" +
                "• Practice coding daily<br>" +
                "• Be clear with fundamentals",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore problem-solving<br>" +
                "• Don’t skip basics<br>" +
                "• Don’t panic in interviews<br>" +
                "• Avoid overconfidence",
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
        new IBM();
    }
}