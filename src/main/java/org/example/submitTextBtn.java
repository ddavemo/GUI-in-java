package org.example;

import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class submitTextBtn implements ActionListener {
    JFrame frame;
    JButton button;
    JTextField text;
    JLabel label;
    submitTextBtn() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        button = new JButton();
        button.setText("Click me");
        button.addActionListener(this);
        button.setBounds(10, 10, 100, 50);

        text = new JTextField();
        text.setBounds(120, 10, 200, 50);
        text.setBackground(Color.gray);
        text.setForeground(Color.green);
        text.setCaretColor(Color.white);

        label = new JLabel();
        label.setBackground(Color.lightGray);
        label.setBounds(10, 80, 200, 50);
        label.setVisible(false);

        frame.add(button);
        frame.add(text);
        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == button) {
            label.setText(text.getText());
            label.setVisible(true);
        }
    }

    public static void main (String [] args) {
        new submitTextBtn();
    }
}
