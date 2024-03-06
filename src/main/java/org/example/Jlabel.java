package org.example;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.JOptionPane;

public class Jlabel {
    public static void main(String [] args) {
        Border border = BorderFactory.createLineBorder(new Color(0xBB0909),3);
        JLabel label = new JLabel();
        label.setText("Hello, how a you");
        ImageIcon image = new ImageIcon("/home/david/david.jpg");
        image.setDescription("Davido");
        label.setIcon(image);
        label.setVisible(true);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0xFFFFFF));
        label.setFont(new Font("Times New Roman", Font.PLAIN, 60));
        label.setIconTextGap(10);
        label.setBackground(Color.black);
        label.setOpaque(false);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(200, 200, 80, 80);

        JFrame frame = new JFrame("Hello there");
        frame.setSize(400, 400);
        frame.setVisible(true);
        //frame.setLayout(null);
        frame.getContentPane().setBackground(Color.green);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setState(0);
        frame.pack();
    }
}
