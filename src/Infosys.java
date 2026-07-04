package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Infosys extends JFrame {

    Infosys() {

        setTitle("Infosys Placement Guide");

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 4000));
        contentPanel.setBackground(new Color(245, 240, 235));

        // 🔷 BANNER IMAGE (use icon/infosys.jpg)
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icon/infosys.jpg"));
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
        y = addSectionTitle(contentPanel, "ABOUT INFOSYS", y);

        y = addBlock(contentPanel, "Overview",
                "Infosys is a global leader in consulting, technology, and outsourcing services.<br>" +
                "Founded in 1981 and headquartered in Bangalore, India.<br>" +
                "Known for digital transformation, cloud, and AI services.<br><br>" +
                "<b>Hiring Roles:</b> System Engineer, Specialist Programmer, Digital Specialist Engineer",
                y);

        y = addBlock(contentPanel, "Core Focus",
                "• Digital Transformation<br>" +
                "• Cloud Computing<br>" +
                "• Artificial Intelligence<br>" +
                "• Enterprise Solutions",
                y);

        y = addBlock(contentPanel, "2026 Focus",
                "• Generative AI & Automation<br>" +
                "• Cloud-first strategies<br>" +
                "• Data analytics & cybersecurity",
                y);

        // 🔶 PROCESS
        y = addSectionTitle(contentPanel, "PLACEMENT PROCESS", y);

        y = addBlock(contentPanel, "Rounds",
                "1. Online Test (Aptitude + Reasoning)<br>" +
                "2. Technical Test (Coding / MCQs)<br>" +
                "3. Technical Interview<br>" +
                "4. HR Interview",
                y);

        // 🔶 PREPARATION
        y = addSectionTitle(contentPanel, "PREPARATION", y);

        y = addBlock(contentPanel, "Technical Topics",
                "• OOPS Concepts<br>" +
                "• DSA (Arrays, Strings, Basics)<br>" +
                "• SQL (Queries, Joins)<br>" +
                "• Basics of OS & DBMS",
                y);

        y = addBlock(contentPanel, "HR Questions",
                "• Tell me about yourself<br>" +
                "• Why Infosys?<br>" +
                "• Strengths & Weaknesses<br>" +
                "• Willing to relocate?",
                y);

        // 🔶 IMPORTANT QUESTIONS
        y = addSectionTitle(contentPanel, "SOME IMPORTANT QUESTIONS", y);

        y = addBlock(contentPanel, "OOPS",
                "<b>Q:</b> What is Encapsulation?<br>" +
                "<b>A:</b> Wrapping data and methods together in a class.",
                y);

        y = addBlock(contentPanel, "DSA",
                "<b>Q:</b> What is a Stack?<br>" +
                "<b>A:</b> LIFO (Last In First Out) data structure.",
                y);

        y = addBlock(contentPanel, "SQL",
                "<b>Q:</b> What is Normalization?<br>" +
                "<b>A:</b> Organizing data to reduce redundancy.",
                y);

        y = addBlock(contentPanel, "Operating System",
                "<b>Q:</b> What is a Deadlock?<br>" +
                "<b>A:</b> When processes wait indefinitely for resources.",
                y);

        y = addBlock(contentPanel, "DBMS",
                "<b>Q:</b> What is a Primary Key?<br>" +
                "<b>A:</b> Unique identifier for table records.",
                y);

        // 🔶 DO / DON'T
        y = addSectionTitle(contentPanel, "DO's & DON'Ts", y);

        y = addColoredBlock(contentPanel, "Do's",
                "• Practice aptitude & coding<br>" +
                "• Revise core subjects<br>" +
                "• Be confident in interviews<br>" +
                "• Prepare projects well",
                y,
                new Color(200, 255, 200));

        y = addColoredBlock(contentPanel, "Don'ts",
                "• Don’t ignore basics<br>" +
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
        new Infosys();
    }
}