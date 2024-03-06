package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jCheckbox implements ActionListener {
    JFrame frame;
    JCheckBox checkBox;
    JButton button;
    JRadioButton radioButton;
    jCheckbox() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        button = new JButton("Submit");
        button.addActionListener(this);

        checkBox = new JCheckBox("How are you");
        checkBox.addActionListener(this);
        radioButton = new JRadioButton("How is it");
        radioButton.addActionListener(this);

        frame.add(checkBox);
        frame.add(radioButton);
        frame.add(button);
        frame.setVisible(true);
    }
    public static void main (String [] args) {
        new jCheckbox();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == button) {
            if(checkBox.isSelected()) {
                System.out.println("CHECK: " + checkBox.isSelected() + " value " + checkBox.getText());
            }
            if(radioButton.isSelected()) {
                System.out.println("RADIO: " + radioButton.isSelected() + " value " + radioButton.getText());
            }
        }
    }
}
