package org.example;

import javax.swing.*;
import java.awt.*;

public class gridLayout {
    public static void main (String [] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(4, 3));

        JPanel panel1 = new JPanel();
        panel1.setSize(20, 20);
        JPanel panel2 = new JPanel();
        panel2.setSize(20, 20);
        JPanel panel3 = new JPanel();
        panel3.setSize(20, 20);
        JPanel panel4 = new JPanel();
        panel4.setSize(20, 20);
        JPanel panel5 = new JPanel();
        panel5.setSize(20, 20);
        JPanel panel6 = new JPanel();
        panel6.setSize(20, 20);
        JPanel panel7 = new JPanel();
        panel7.setSize(20, 20);
        JPanel panel8 = new JPanel();
        panel8.setSize(20, 20);
        JPanel panel9 = new JPanel();
        panel9.setSize(20, 20);
        JPanel panel10 = new JPanel();
        panel10.setSize(20, 20);

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(new Color(0x1111a1));
        panel4.setBackground(new Color(0x444444));
        panel5.setBackground(Color.green);
        panel6.setBackground(Color.gray);
        panel7.setBackground(Color.lightGray);
        panel8.setBackground(Color.darkGray);
        panel9.setBackground(Color.cyan);
        panel10.setBackground(Color.magenta);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);
        frame.add(panel8);
        frame.add(panel9);
        frame.add(panel10);

        frame.setVisible(true);
    }
}
