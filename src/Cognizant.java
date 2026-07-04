package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cognizant extends JFrame {

    Cognizant() {

        setTitle("Cognizant Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000)); // big height for scroll
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/cognizant.jpg"));
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
        y = addSectionTitle(contentPanel, "ABOUT COGNIZANT", y);

        y = addBlock(contentPanel, "Overview",
                "Cognizant is a global professional services company founded in 1994.<br>" +
                "It provides IT services, consulting, and AI-driven solutions.<br>" +
                "Works with Fortune 2000 companies worldwide.<br><br>" +
                "<b>Hiring:</b> GenC, GenC Pro, GenC Next (4.45 – 6.75 LPA)",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• AI Builder & Automation<br>" +
                "• Cloud Data Management<br>" +
                "• Digital Engineering<br>" +
                "• Software Development",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• AI-integrated Capital Markets<br>" +
                "• Agentic Retail CX<br>" +
                "• Project Leap (AI transformation)",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. Communication Round<br>" +
                "2. Aptitude + Game Round<br>" +
                "3. Technical Test (Coding + SQL)<br>" +
                "4. Technical + HR Interview",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• OOPS Concepts<br>" +
                "• SQL (Joins, Normalization)<br>" +
                "• DSA (Arrays, Linked List)<br>" +
                "• Java/Python Basics",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why Cognizant?<br>" +
                "• Willing to relocate?<br>" +
                "• Team experience",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "Normalization",
                "<b>Q:</b> What is Normalization?<br>" +
                "<b>A:</b> Process of organizing data to reduce redundancy.",
                y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Polymorphism?<br>" +
                "<b>A:</b> Ability of object to take multiple forms.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> Second Highest Salary?<br>" +
                "<b>A:</b> Use subquery or LIMIT/OFFSET.",
                y);

        y = addBlock(contentPanel, "Networking",
                "<b>Q:</b> Why UDP over TCP?<br>" +
                "<b>A:</b> Faster, no error checking (used in streaming).",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> Process vs Thread?<br>" +
                "<b>A:</b> Process = independent, Thread = lightweight.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Dress formal<br>" +
                "• Practice coding<br>" +
                "• Be confident<br>" +
                "• Prepare projects",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t cheat<br>" +
                "• Don’t fake skills<br>" +
                "• Don’t switch tabs<br>" +
                "• Avoid regional language",
                y,
                new Color(255, 200, 200));

        // 🔷 SCROLL FIX
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(20);
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
        new Cognizant();
    }
}