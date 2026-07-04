package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartLearning2 extends JFrame implements ActionListener {

    JButton  add_Ride,get_started, add_Sign, add_Login, get_started2, add_Sign2, add_Login2, get_started3, add_Sign4, add_Sign3, add_Login3, add_Login4, get_started4, get_started5, add_Sign5, add_Login5, get_started6, add_Sign6, add_Login6, get_started7, add_Sign7, add_Login7, get_started8, add_Sign8, add_Login8;

    StartLearning2() {
        super("Interview Analytics System");
        
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1920, 3000)); 
        contentPanel.setBackground(Color.WHITE);

        get_started = new JButton("JAVA MCQ TEST");
        get_started.setBounds(135, 265, 390, 80);
        get_started.setBackground(Color.BLACK);
        get_started.setForeground(Color.PINK);
        get_started.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started.addActionListener(this);
        contentPanel.add(get_started);     

        add_Login = new JButton("PYTHON MCQ TEST");
        add_Login.setBounds(560, 265, 390, 80);
        add_Login.setBackground(Color.BLACK);
        add_Login.setForeground(Color.PINK);
        add_Login.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login.addActionListener(this);
        contentPanel.add(add_Login);

        add_Sign = new JButton("C++ MCQ TEST");
        add_Sign.setBounds(980, 265, 390, 80);
        add_Sign.setBackground(Color.BLACK);
        add_Sign.setForeground(Color.PINK);
        add_Sign.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign.addActionListener(this);
        contentPanel.add(add_Sign);
        
        get_started2 = new JButton("WEB TECH MCQ TEST");
        get_started2.setBounds(1400, 265, 390, 80);
        get_started2.setBackground(Color.BLACK);
        get_started2.setForeground(Color.PINK);
        get_started2.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started2.addActionListener(this);
        contentPanel.add(get_started2);
        
        
        //--------------
        add_Login2 = new JButton("PRACTICE CODING");
        add_Login2.setBounds(135, 565, 390, 80);
        add_Login2.setBackground(Color.BLACK);
        add_Login2.setForeground(Color.PINK);
        add_Login2.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login2.addActionListener(this);
        contentPanel.add(add_Login2);

        add_Sign2 = new JButton("TOP 50 CODES");  //126,94,96
        add_Sign2.setBounds(560, 565, 390, 80);
        //add_Sign2.setBackground(new Color(126,94,96));
        add_Sign2.setBackground(Color.BLACK);
        add_Sign2.setForeground(Color.PINK);
        add_Sign2.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign2.addActionListener(this);
        contentPanel.add(add_Sign2);
       
        get_started3 = new JButton("TOP 100 CODES");
        get_started3.setBounds(980, 565, 390, 80);
        //get_started3.setBackground(new Color(255, 245, 247));
        get_started3.setBackground(Color.BLACK);
        get_started3.setForeground(Color.PINK);
        get_started3.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started3.addActionListener(this);
        contentPanel.add(get_started3);
        
        add_Login3 = new JButton(" ");
        add_Login3.setBounds(1400, 565, 390, 80);
        add_Login3.setBackground(Color.BLACK);
        add_Login3.setForeground(Color.PINK);
        add_Login3.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login3.addActionListener(this);
        contentPanel.add(add_Login3);

        
        //----------
        add_Sign3 = new JButton("COMPUTER FUNDAMENTALS");
        add_Sign3.setBounds(135, 865, 390, 80);
        add_Sign3.setBackground(Color.BLACK);
        add_Sign3.setForeground(Color.PINK);
        add_Sign3.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign3.addActionListener(this);
        contentPanel.add(add_Sign3);
               
        get_started4 = new JButton("COMPUTER NETWORKS");
        get_started4.setBounds(560, 865, 390, 80);
        //get_started4.setBackground(new Color(216,191,216));
        get_started4.setBackground(Color.BLACK);
        get_started4.setForeground(Color.PINK);
        get_started4.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started4.addActionListener(this);
        contentPanel.add(get_started4);
        
        add_Login4 = new JButton("OPERATING SYSTEMS");
        add_Login4.setBounds(980, 865, 390, 80);
        add_Login4.setBackground(Color.BLACK);
        add_Login4.setForeground(Color.PINK);
        add_Login4.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login4.addActionListener(this);
        contentPanel.add(add_Login4);

        add_Sign4 = new JButton("DBMS");
        add_Sign4.setBounds(1400, 865, 390, 80);
        add_Sign4.setBackground(Color.BLACK);
        add_Sign4.setForeground(Color.PINK);
        add_Sign4.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign4.addActionListener(this);
        contentPanel.add(add_Sign4);
        
        
        //------------------------
        get_started5 = new JButton("OBJECT ORIENTED PROG.");
        get_started5.setBounds(135, 1125, 390, 80);
        get_started5.setBackground(Color.BLACK);
        get_started5.setForeground(Color.PINK);
        get_started5.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started5.addActionListener(this);
        contentPanel.add(get_started5);
        
        add_Login5 = new JButton("JAVA QUESTION BANK");
        add_Login5.setBounds(560, 1125, 390, 80);
        add_Login5.setBackground(Color.BLACK);
        add_Login5.setForeground(Color.PINK);
        add_Login5.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login5.addActionListener(this);
        contentPanel.add(add_Login5);

        add_Sign5 = new JButton("PYTHON QUESTION BANK");
        add_Sign5.setBounds(980, 1125, 390, 80);
        add_Sign5.setBackground(Color.BLACK);
        add_Sign5.setForeground(Color.PINK);
        add_Sign5.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign5.addActionListener(this);
        contentPanel.add(add_Sign5);
     
        get_started6 = new JButton("WEB QUESTION BANK");
        get_started6.setBounds(1400, 1125, 390, 80);
        get_started6.setBackground(Color.BLACK);
        get_started6.setForeground(Color.PINK);
        get_started6.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started6.addActionListener(this);
        contentPanel.add(get_started6);
        
        
        //----------------------
        add_Login6 = new JButton("COGNIZANT");
        add_Login6.setBounds(135, 1455, 390, 80);
        add_Login6.setBackground(Color.BLACK);
        add_Login6.setForeground(Color.PINK);
        add_Login6.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login6.addActionListener(this);
        contentPanel.add(add_Login6);

        add_Sign6 = new JButton("Accenture");
        add_Sign6.setBounds(560, 1455, 390, 80);
        add_Sign6.setBackground(Color.BLACK);
        add_Sign6.setForeground(Color.PINK);
        add_Sign6.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign6.addActionListener(this);
        contentPanel.add(add_Sign6);
      
        get_started7 = new JButton("WIPRO");
        get_started7.setBounds(980, 1455, 390, 80);
        get_started7.setBackground(Color.BLACK);
        get_started7.setForeground(Color.PINK);
        get_started7.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started7.addActionListener(this);
        contentPanel.add(get_started7);
   
        add_Login7 = new JButton("TCS");
        add_Login7.setBounds(1400, 1455, 390, 80);
        add_Login7.setBackground(Color.BLACK);
        add_Login7.setForeground(Color.PINK);
        add_Login7.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login7.addActionListener(this);
        contentPanel.add(add_Login7);
        
        
        //---------------------------
        add_Sign7 = new JButton("ORACLE");
        add_Sign7.setBounds(135, 1715, 390, 80);
        add_Sign7.setBackground(Color.BLACK);
        add_Sign7.setForeground(Color.PINK);
        add_Sign7.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign7.addActionListener(this);
        contentPanel.add(add_Sign7);
        
        get_started8 = new JButton("INFOSYS");
        get_started8.setBounds(560, 1715, 390, 80);
        get_started8.setBackground(Color.BLACK);
        get_started8.setForeground(Color.PINK);
        get_started8.setFont(new Font("Tahoma", Font.BOLD, 25));
        get_started8.addActionListener(this);
        contentPanel.add(get_started8);

        add_Login8 = new JButton("CAPGEMINI");
        add_Login8.setBounds(980, 1715, 390, 80);
        add_Login8.setBackground(Color.BLACK);
        add_Login8.setForeground(Color.PINK);
        add_Login8.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Login8.addActionListener(this);
        contentPanel.add(add_Login8);

        add_Sign8 = new JButton("IBM");
        add_Sign8.setBounds(1400, 1715, 390, 80);
        add_Sign8.setBackground(Color.BLACK);
        add_Sign8.setForeground(Color.PINK);
        add_Sign8.setFont(new Font("Tahoma", Font.BOLD, 25));
        add_Sign8.addActionListener(this);
        contentPanel.add(add_Sign8);
        
        
        //--------------------------------------

        JPanel panel2 = new JPanel(); //black line
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 1910, 50);
        panel2.setBackground(new Color(0, 0, 0));
        contentPanel.add(panel2);
        JLabel label6 = new JLabel("WHAT ARE YOU INTRESTED IN????");
        label6.setFont(new Font("Tahoma", Font.BOLD, 22));
        label6.setForeground(Color.PINK);
        label6.setBounds(780, 5, 1000, 35); 
        panel2.add(label6);

        JButton back = new JButton("Back");
        back.setBounds(15,3,95,45);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.PINK);
        panel2.add(back);
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

        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(100, 180, 350, 50);
        panel3.setBackground(new Color(255,228,225));
        contentPanel.add(panel3);
        JLabel label5 = new JLabel("MCQ TEST");
        label5.setFont(new Font("Tahoma", Font.BOLD, 22));
        label5.setForeground(Color.BLACK);
        label5.setBounds(80, 5, 450, 30); 
        panel3.add(label5);
        
        JPanel panel13 = new JPanel();
        panel13.setLayout(null);
        panel13.setBounds(100, 480, 350, 50);
        panel13.setBackground(new Color(255,228,225));
        contentPanel.add(panel13);
        JLabel label15 = new JLabel("Coding");
        label15.setFont(new Font("Tahoma", Font.BOLD, 22));
        label15.setForeground(Color.BLACK);
        label15.setBounds(80, 5, 450, 30); 
        panel13.add(label15);
        
        JPanel panel14 = new JPanel();
        panel14.setLayout(null);
        panel14.setBounds(100, 780, 350, 50);
        panel14.setBackground(new Color(255,228,225));
        contentPanel.add(panel14);
        JLabel label18 = new JLabel("Computer Subjects");
        label18.setFont(new Font("Tahoma", Font.BOLD, 22));
        label18.setForeground(Color.BLACK);
        label18.setBounds(80, 5, 450, 30); 
        panel14.add(label18);
        
        JPanel panel15 = new JPanel();
        panel15.setLayout(null);
        panel15.setBounds(100, 1370, 350, 50);
        panel15.setBackground(new Color(255,228,225));
        contentPanel.add(panel15);
        JLabel label19 = new JLabel("Companies");
        label19.setFont(new Font("Tahoma", Font.BOLD, 22));
        label19.setForeground(Color.BLACK);
        label19.setBounds(80, 5, 450, 30); 
        panel15.add(label19);
        
        
        JPanel panel8 = new JPanel();
        panel8.setLayout(null);
        panel8.setBounds(100, 230, 1730, 150);
        panel8.setBackground(new Color(126,94,96));
        contentPanel.add(panel8);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(100, 530, 1730, 150);
        panel.setBackground(new Color(126,94,96));
        contentPanel.add(panel);

        JPanel panel9 = new JPanel();
        panel9.setLayout(null);
        panel9.setBounds(100, 830, 1730, 150);
        panel9.setBackground(new Color(126,94,96));
        contentPanel.add(panel9);

        JPanel panel10 = new JPanel();
        panel10.setLayout(null);
        panel10.setBounds(100, 1090, 1730, 150);
        panel10.setBackground(new Color(126,94,96));
        contentPanel.add(panel10);
        
        JPanel panel11 = new JPanel();
        panel11.setLayout(null);
        panel11.setBounds(100, 1420, 1730, 150);
        panel11.setBackground(new Color(126,94,96));
        contentPanel.add(panel11);
        
        JPanel panel12 = new JPanel();
        panel12.setLayout(null);
        panel12.setBounds(100, 1680, 1730, 150);
        panel12.setBackground(new Color(126,94,96));
        contentPanel.add(panel12);
        
//        JPanel panel13 = new JPanel();
//        panel13.setLayout(null);
//        panel13.setBounds(100, 1430, 1730, 150);
//        panel13.setBackground(new Color(211, 211, 211));
//        contentPanel.add(panel13);
//
//        JPanel panel14 = new JPanel();
//        panel14.setLayout(null);
//        panel14.setBounds(100, 1630, 1730, 150);
//        panel14.setBackground(new Color(211, 211, 211));
//        contentPanel.add(panel14);
        
        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icon/solo_study.jpg"));
        Image image3 = imageIcon4.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label4 = new JLabel(new ImageIcon(image3));
        label4.setBounds(130, 1950, 700, 450);
        contentPanel.add(label4);
        
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/group_study.jpg"));
        Image image4 = imageIcon1.getImage().getScaledInstance(700, 450, Image.SCALE_DEFAULT);
        JLabel label1 = new JLabel(new ImageIcon(image4));
        label1.setBounds(1130, 2500, 700, 450);
        contentPanel.add(label1);
        
        
        
        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/books.jpg"));
        Image image2 = imageIcon3.getImage().getScaledInstance(1900, 1200, Image.SCALE_DEFAULT);
        JLabel label3 = new JLabel(new ImageIcon(image2));
        label3.setBounds(0, 0, 1900, 1200);
        contentPanel.add(label3);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/books.jpg"));
        Image image1 = imageIcon3.getImage().getScaledInstance(1900, 1200, Image.SCALE_DEFAULT);
        JLabel label2 = new JLabel(new ImageIcon(image1));
        label2.setBounds(0, 1000, 1900, 1200);
        contentPanel.add(label2);
        
        JPanel panel7 = new JPanel();
        panel7.setLayout(null);
        panel7.setBounds(140, 2560, 700, 450);
        panel7.setBackground(new Color(255, 255, 255));
        contentPanel.add(panel7);
        JLabel label16 = new JLabel("Monthly");
        label16.setFont(new Font("Tahoma", Font.BOLD, 60));
        label16.setForeground(Color.BLACK);
        label16.setBounds(250, 70, 1000, 60); 
        panel7.add(label16);
        JLabel label17 = new JLabel("Land That Dream Job");
        label17.setFont(new Font("Tahoma", Font.BOLD, 40));
        label17.setForeground(Color.BLACK);
        label17.setBounds(160, 200, 1000, 40); 
        panel7.add(label17);
        JLabel label14 = new JLabel("ALWAYS TRY YOUR BEST!!!!");
        label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label14.setForeground(Color.BLACK);
        label14.setBounds(200, 300, 1000, 20); 
        panel7.add(label14);
        
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBounds(0, 0, 1920, 1080);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        getContentPane().setBackground(new Color(255, 255, 255));
        getContentPane().setLayout(null);
        getContentPane().add(scrollPane);
        setSize(1940, 1145);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add_Sign5) {
            new PythonStudent();
        } else if (e.getSource() == add_Sign2) {
            new Top50Codes();
        } else if (e.getSource() == add_Sign3) {
            new CFStudent();
        } else if (e.getSource() == add_Login) {
            new PythonRules("User");
        } else if (e.getSource() == add_Login2) {
            new PracticeCoding();
        } else if (e.getSource() == add_Login4) {
            new OSStudent();
        } else if (e.getSource() == add_Login5) {
            new JavaStudent();
        } else if (e.getSource() == add_Login6) {
            new Cognizant();
        } else if (e.getSource() == add_Login7) {
            new TCS();
        } else if (e.getSource() == add_Login8) {
            new Capgemini();
        } else if (e.getSource() == get_started) {
            new JavaRules("User");
        } else if (e.getSource() == get_started2) {
            new WebTechRules("User");
        } else if (e.getSource() == get_started3) {
            new Top100Codes();
        } else if (e.getSource() == get_started4) {
            new CNStudent();
        } else if (e.getSource() == get_started8) {
            new Infosys();
        } else if (e.getSource() == get_started5) {
            new OOPStudent();
        } else if (e.getSource() == get_started6) {
            new WebTechStudent();
        } else if (e.getSource() == get_started7) {
            new Wipro();
        } else if (e.getSource() == add_Sign6) {
            new Accenture();
        } else if (e.getSource() == add_Sign7) {
            new Oracle();
        } else if (e.getSource() == add_Sign4) {
            new DBMSStudent();
        } else if (e.getSource() == add_Sign8) {
            new IBM();
        } else if (e.getSource() == add_Sign) {
            new CPPRules("User");
            //setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StartLearning2();
    }
}

