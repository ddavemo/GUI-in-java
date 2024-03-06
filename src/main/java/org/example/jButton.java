package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jButton extends JFrame implements ActionListener {
    JButton button;
    ImageIcon icon;
    JLabel label;
    jButton() {
        icon = new ImageIcon("/home/david/david.jpg");
        button = new JButton();
        button.setBounds(100, 100, 250, 50);
        button.setText("Click me");
        button.setBackground(Color.gray);
        button.setForeground(Color.black);
        button.setFocusable(false);
        button.addActionListener(this);
//        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-10);
        button.setBorder(BorderFactory.createLineBorder(Color.green));
//        button.setEnabled(false);

        label = new JLabel("Hello");
        label.setBounds(300, 300, 100, 40);
        label.setVisible(false);



        this.setSize(400, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.setVisible(true);
    }

    public static void main (String[] args) {
        new jButton();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("You clicked me");
            button.setEnabled(false);
            label.setVisible(true);
        }
    }
}