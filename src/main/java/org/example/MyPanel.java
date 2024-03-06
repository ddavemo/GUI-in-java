package org.example;

import javax.swing.*;
import java.awt.*;

public class MyPanel {
    public static class MyFrame extends JFrame {
    }
    public static void main (String [] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
//        frame.setLayout(0, 0, 250, 250);
        frame.getContentPane().setBackground(Color.red);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.add(frame);
    }
}