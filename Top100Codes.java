package interview.analytics.system;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class Top100Codes extends JFrame implements ActionListener {

    JTable table;
    JButton start, back;

    Top100Codes() {

        setTitle("Top 100 Coding Questions");
        setSize(1920,1145);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🖼 BACKGROUND IMAGE (MAIN CONTAINER)
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icon/books.jpg"));
        Image bgImg = bgIcon.getImage().getScaledInstance(1920, 1145, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(bgImg));
        background.setLayout(new BorderLayout());
        setContentPane(background); // 🔥 IMPORTANT

        // 🌸 Main Panel (TRANSPARENT)
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setOpaque(false); // allow background image to show
        background.add(mainPanel);

        // 🧾 Heading
        JLabel heading = new JLabel("Top 100 Coding Questions", JLabel.CENTER);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 52));
        heading.setForeground(Color.BLACK);
        heading.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        mainPanel.add(heading, BorderLayout.NORTH);

        // 📦 Card Panel (semi-transparent)
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(new Color(255, 255, 255, 230)); // slight transparency
        card.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        // 📊 Table
        table = new JTable();

        try {
            Con c = new Con();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM top100Codes");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.removeColumn(table.getColumnModel().getColumn(4));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 🎨 Table styling
        table.setRowHeight(40);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.setShowGrid(false);
        table.setIntercellSpacing(new Dimension(0, 0));

        // 🎀 Pink rows
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus,
                                                           int row, int col) {

                Component c = super.getTableCellRendererComponent(
                        table, value, isSelected, hasFocus, row, col);

                if (!isSelected) {
                    c.setBackground(row % 2 == 0 ?
                            new Color(255, 245, 247) :
                            new Color(255, 228, 235));
                } else {
                    c.setBackground(new Color(255, 105, 180));
                    c.setForeground(Color.WHITE);
                }
                return c;
            }
        });

        // 🧱 Header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 15));
        header.setBackground(new Color(255, 182, 193));
        header.setForeground(Color.BLACK);

        // 🔗 Click open URL
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                try {
                    String url = table.getModel().getValueAt(row, 4).toString();
                    Desktop.getDesktop().browse(new URI(url));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        card.add(scroll);

        mainPanel.add(card, BorderLayout.CENTER);

        // 🔘 Buttons
        JPanel btnPanel = new JPanel();
        btnPanel.setOpaque(false);

        start = createModernButton("Start Practice");
        back = createModernButton("Back");

        btnPanel.add(start);
        btnPanel.add(Box.createHorizontalStrut(20));
        btnPanel.add(back);

        mainPanel.add(btnPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // 🎯 Button style
    private JButton createModernButton(String text) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setBackground(new Color(0, 0, 0));
        btn.setForeground(Color.PINK);
        btn.setPreferredSize(new Dimension(150, 40));
        btn.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {
            int row = table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a question first!");
            } else {
                String question = table.getValueAt(row, 1).toString();
                JOptionPane.showMessageDialog(this, "Opening: " + question);
            }

        } else if (e.getSource() == back) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new Top100Codes();
    }
}