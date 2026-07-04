package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wipro extends JFrame {

    Wipro() {

        setTitle("Wipro Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use icon/wipro.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/wipro.jpeg"));
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
        y = addSectionTitle(contentPanel, "ABOUT WIPRO", y);

        y = addBlock(contentPanel, "Overview",
                "Wipro is a leading global IT services company headquartered in India.<br>" +
                "Founded in 1945, it provides consulting, IT, and business process services.<br>" +
                "Strong presence in digital transformation and cloud technologies.<br><br>" +
                "<b>Hiring Roles:</b> Project Engineer, Elite NTH, Turbo",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• Cloud Computing<br>" +
                "• Cybersecurity<br>" +
                "• AI & Automation<br>" +
                "• Digital Transformation",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• AI-driven enterprise solutions<br>" +
                "• Sustainable IT services<br>" +
                "• Automation & DevOps expansion",
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
                "• SQL Basics<br>" +
                "• DSA (Arrays, Strings)<br>" +
                "• Basics of OS & Networking",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why Wipro?<br>" +
                "• Strengths & Weaknesses<br>" +
                "• Willing to relocate?",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Encapsulation?<br>" +
                "<b>A:</b> Binding data and methods into a single unit.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> What is a Primary Key?<br>" +
                "<b>A:</b> A unique identifier for table records.",
                y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> What is an Array?<br>" +
                "<b>A:</b> Collection of elements stored in contiguous memory.",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> What is a Process?<br>" +
                "<b>A:</b> A program in execution.",
                y);

        y = addBlock(contentPanel, "Networking",
                "<b>Q:</b> What is an IP Address?<br>" +
                "<b>A:</b> Unique identifier for devices on a network.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Practice aptitude regularly<br>" +
                "• Prepare coding basics<br>" +
                "• Revise fundamentals<br>" +
                "• Be confident",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore basics<br>" +
                "• Don’t copy answers<br>" +
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
        new Wipro();
    }
}