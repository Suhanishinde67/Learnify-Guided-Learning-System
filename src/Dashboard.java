package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton user,driv,add;
    Dashboard(){
        super("Interview Analytics System");

        user = new JButton("STUDENT");
        user.setBounds(350,130,140,30);
        user.setFont(new Font("Tahoma", Font.BOLD,15));
        user.setBackground(new Color(255,98,0));
        user.setForeground(Color.WHITE);
        user.addActionListener(this);
        add(user);

        driv = new JButton("FACULTY");
        driv.setBounds(350,500,140,30);
        driv.setFont(new Font("Tahoma", Font.BOLD,15));
        driv.setBackground(new Color(255,98,0));
        driv.setForeground(Color.WHITE);
        driv.addActionListener(this);
        add(driv);
        
        add = new JButton("ADMIN");
        add.setBounds(350,900,140,30);
        add.setFont(new Font("Tahoma", Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
        JButton back = new JButton("Back");
        back.setBounds(150,1030,95,45);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.PINK);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // better than setVisible(false)
                new Home(); 
            }
        });        

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i22 = i111.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(100,30,200,195);
        add(label11);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i2 = i11.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(100,400,200,195);
        add(label1);

        ImageIcon i1111 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i3 = i1111.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1111 = new ImageIcon(i3);
        JLabel label111 = new JLabel(imageIcon1111);
        label111.setBounds(100,800,200,195);
        add(label111);
        
        
        ImageIcon i1141 = new ImageIcon(ClassLoader.getSystemResource("icon/studying_boy.gif"));
        Image i54 = i1141.getImage().getScaledInstance(1400,950, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1711 = new ImageIcon(i54);
        JLabel label711 = new JLabel(imageIcon1711);
        label711.setBounds(0, 0, 1950, 1150);
        add(label711);

        getContentPane().setBackground(new Color(255, 255, 255));
        getContentPane().setLayout(null);
        setLayout(null);
        setSize(1950,1150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    if (e.getSource() == user) {
        new StudentLogin();
        setVisible(false);
    } else if (e.getSource() == driv) {
        new FacultyLogin();
        setVisible(false);
    } else {
        new AdminLogin();
        setVisible(false);
    }
    }

    
    public static void main(String[] args) {
        new Dashboard();
    }
}
