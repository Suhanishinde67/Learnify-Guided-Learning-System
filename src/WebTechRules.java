package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WebTechRules extends JFrame implements ActionListener {

    JButton start, back;
    String name;

    WebTechRules(String name){

        this.name = name;

        JLabel heading = new JLabel("PRACTICE WebTech MCQ TEST");
        heading.setBounds(530,200,900,50);
        heading.setFont( new Font("Algerian", Font.BOLD, 58));
        heading.setForeground(new Color(126,94,96));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(580,380,1000,350);
        rules.setFont( new Font("Tahoma", Font.PLAIN, 28));
        rules.setForeground(new Color(22,99,54));
        rules.setText(
                "<html>"+
                        //"1. HIII. " + "<br><br>" +
                        "1. There are a total 10 questions. " + "<br><br>" +
                        "2. You only have 15 seconds to answer one question." + "<br><br>" +
                        "3. The test can not be submitted unless you reach the last question." + "<br><br>" +
                        "4. If you use 'Help', 2 incorrect options will be eliminated ." + "<br><br>" +
                        "5. Give your best ." + "<br><br>" +
                        "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(760,870,100,30);
        back.setBackground(new Color(22,99,54));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(980,870,100,30);
        start.setBackground(new Color(22,99,54));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/back.png"));
        Image i = i1.getImage().getScaledInstance(1900,1100,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,1900,1100);
        add(image);

        setSize(1940,1145);
        setLocation(0,0);
        setLayout(null);
        //setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start){
            
            new WebTechQuiz(name);
            setVisible(false);
        }else {
            new StartLearning2();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new WebTechRules("User");
    }
}
