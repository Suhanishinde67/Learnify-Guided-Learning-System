package interview.analytics.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CPPQuiz extends JFrame implements ActionListener {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];

    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;

    String name;

    CPPQuiz(String name) {
        this.name = name;
        setBounds(0, 0, 1940, 1145);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        
        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/quiz.png"));
        Image image2 = imageIcon3.getImage().getScaledInstance(1915, 500, Image.SCALE_DEFAULT);
        JLabel label3 = new JLabel(new ImageIcon(image2));
        label3.setBounds(0, 0, 1915, 500);
        add(label3);

        
        qno = new JLabel();
        qno.setBounds(100, 550, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        
        question = new JLabel();
        question.setBounds(150, 550, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        
        questions[0][0] = "Which symbol is used to end a statement in C++?";
        questions[0][1] = ".";
        questions[0][2] = ":";
        questions[0][3] = ";";
        questions[0][4] = ",";

        questions[1][0] = "Which of the following is a valid C++ data type?";
        questions[1][1] = "int";
        questions[1][2] = "real";
        questions[1][3] = "decimal";
        questions[1][4] = "number";

        questions[2][0] = "Which operator is used for scope resolution?";
        questions[2][1] = ".";
        questions[2][2] = "::";
        questions[2][3] = "->";
        questions[2][4] = ":";

        questions[3][0] = "Which keyword is used to define a class?";
        questions[3][1] = "class";
        questions[3][2] = "struct";
        questions[3][3] = "object";
        questions[3][4] = "define";

        questions[4][0] = "Which function is used for output in C++?";
        questions[4][1] = "print()";
        questions[4][2] = "cout";
        questions[4][3] = "echo";
        questions[4][4] = "printf()";

        questions[5][0] = "Which header file is required for cout?";
        questions[5][1] = "stdio.h";
        questions[5][2] = "iostream";
        questions[5][3] = "conio.h";
        questions[5][4] = "stdlib.h";

        questions[6][0] = "Which operator is used to access pointer?";
        questions[6][1] = ".";
        questions[6][2] = "&";
        questions[6][3] = "*";
        questions[6][4] = "->";

        questions[7][0] = "Which concept allows same function name with different parameters?";
        questions[7][1] = "Inheritance";
        questions[7][2] = "Polymorphism";
        questions[7][3] = "Encapsulation";
        questions[7][4] = "Abstraction";

        questions[8][0] = "Which loop is guaranteed to execute at least once?";
        questions[8][1] = "for";
        questions[8][2] = "while";
        questions[8][3] = "do-while";
        questions[8][4] = "none";

        questions[9][0] = "Which keyword is used for dynamic memory allocation?";
        questions[9][1] = "malloc";
        questions[9][2] = "alloc";
        questions[9][3] = "new";
        questions[9][4] = "create";

        // 🔹 ANSWERS
        answers[0][1] = ";";
        answers[1][1] = "int";
        answers[2][1] = "::";
        answers[3][1] = "class";
        answers[4][1] = "cout";
        answers[5][1] = "iostream";
        answers[6][1] = "->";
        answers[7][1] = "Polymorphism";
        answers[8][1] = "do-while";
        answers[9][1] = "new";

        // 🔹 OPTIONS
        opt1 = new JRadioButton();
        opt1.setBounds(170, 620, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170, 660, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170, 700, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 740, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        // 🔹 NEXT
        next = new JButton("Next");
        next.setBounds(700, 780, 200, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.setBackground(new Color(22, 99, 54));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        // 🔹 HELP
        lifeline = new JButton("Help");
        lifeline.setBounds(930, 780, 200, 30);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lifeline.setBackground(new Color(22, 99, 54));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);

        // 🔹 SUBMIT
        submit = new JButton("Submit");
        submit.setBounds(1150, 780, 200, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        submit.setBackground(new Color(255, 215, 0));
        submit.setForeground(Color.BLACK);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        start(count);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == next) {

            ans_given = 1;

            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

        } else if (ae.getSource() == lifeline) {

            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);

        } else if (ae.getSource() == submit) {

            ans_given = 1;

            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }

            setVisible(false);
            new CPPScore(name, score);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }

        timer--;

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {}

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {

            timer = 15;

            if (count == 9) {
                new CPPScore(name, score);
                setVisible(false);
            } else {
                count++;
                start(count);
            }
        }
    }

    public void start(int count) {

        // 🔥 FIX
        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);

        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);

        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }

    public static void main(String[] args) {
        new CPPQuiz("User");
    }
}