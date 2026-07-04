package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accenture extends JFrame {

    Accenture() {

        setTitle("Accenture Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use icon/accenture.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/accenture.png"));
        Image img = icon.getImage().getScaledInstance(1920, 500, Image.SCALE_SMOOTH);
        JLabel banner = new JLabel(new ImageIcon(img));
        banner.setBounds(0, 0, 1920, 500);
        banner.setLayout(null);
        contentPanel.add(banner);

        // 🔥 Heading
        JLabel heading = new JLabel("Accenture Preparation Hub 2026");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 45));
        heading.setForeground(Color.WHITE);
        heading.setBounds(300, 200, 1300, 60);
        banner.add(heading);
        
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
        y = addSectionTitle(contentPanel, "ABOUT ACCENTURE", y);

        y = addBlock(contentPanel, "Overview",
                "Accenture is a global professional services company specializing in IT services, consulting, and digital transformation.<br>" +
                "Headquartered in Dublin, Ireland.<br>" +
                "Known for innovation in cloud, AI, and enterprise solutions.<br><br>" +
                "<b>Hiring Roles:</b> ASE (Associate Software Engineer), Advanced ASE",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• Cloud Computing<br>" +
                "• Artificial Intelligence<br>" +
                "• Cybersecurity<br>" +
                "• Digital Transformation",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• Generative AI solutions<br>" +
                "• Cloud-first architecture<br>" +
                "• Intelligent automation & analytics",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. Cognitive & Technical Assessment<br>" +
                "2. Coding Round<br>" +
                "3. Communication Assessment<br>" +
                "4. Technical + HR Interview",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• OOPS Concepts<br>" +
                "• SQL (Queries, Joins)<br>" +
                "• DSA (Arrays, Strings, Basics)<br>" +
                "• Basics of OS & Networking",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why Accenture?<br>" +
                "• Strengths & Weaknesses<br>" +
                "• Willing to relocate?",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Inheritance?<br>" +
                "<b>A:</b> Mechanism where one class inherits properties of another.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> Difference between INNER JOIN and LEFT JOIN?<br>" +
                "<b>A:</b> INNER JOIN returns matching rows; LEFT JOIN returns all left table rows.",
                y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> What is Time Complexity?<br>" +
                "<b>A:</b> Measure of algorithm efficiency in terms of input size.",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> What is Multithreading?<br>" +
                "<b>A:</b> Execution of multiple threads within a process.",
                y);

        y = addBlock(contentPanel, "Networking",
                "<b>Q:</b> What is HTTP?<br>" +
                "<b>A:</b> Protocol used to transfer web data.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Practice aptitude & coding<br>" +
                "• Revise fundamentals<br>" +
                "• Communicate clearly<br>" +
                "• Be confident",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore communication skills<br>" +
                "• Don’t fake knowledge<br>" +
                "• Don’t panic<br>" +
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
        new Accenture();
    }
}