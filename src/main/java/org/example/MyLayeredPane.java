package org.example;

import javax.swing.*;
import java.awt.*;

public class MyLayeredPane {
    public static void main (String [] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 400, 400);

        JLabel label1 = new JLabel();
        label1.setBounds(20, 20, 80, 80);
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        JLabel label2 = new JLabel();
        label2.setBounds(40, 40, 100, 100);
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        JLabel label3 = new JLabel();
        label3.setBounds(60, 60, 120, 120);
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        JLabel label4 = new JLabel();
        label4.setBounds(80, 80, 140, 140);
        label4.setOpaque(true);
        label4.setBackground(Color.gray);

        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));
        layeredPane.add(label4, Integer.valueOf((3)));

        frame.add(layeredPane);
        frame.setVisible(true);

    }
}
