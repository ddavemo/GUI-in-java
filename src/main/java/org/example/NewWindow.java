package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener {
    JButton button;
    JFrame frame;
    NewWindow() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);
        frame.setLayout(null);

        button = new JButton("Grid Layout");
        button.setBounds(100, 100,200, 50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            gridLayout layout = new gridLayout();
            frame.dispose();
        }
    }

    public static void main (String [] args) {
        new NewWindow();
    }
}
