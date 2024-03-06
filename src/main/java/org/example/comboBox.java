package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox extends JFrame implements ActionListener {
    JComboBox combo;
    JButton button;
    comboBox() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        Integer[] animals = {56, 87, 78};
        combo = new JComboBox(animals);
//        combo.setEditable(true);
//        System.out.println(combo.getItemCount());
        combo.addItem("cow");
//        combo.insertItemAt("pig", 0);
//        combo.setSelectedIndex(0);
//        combo.removeItem("dog");
//        combo.removeItemAt(2);
//        combo.removeAllItems();


        button = new JButton("submit");
        button.addActionListener(this);

        this.add(combo);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == button) {
            System.out.println(combo.getSelectedIndex());
        }
    }
    public static void main (String [] args) {
        new comboBox();
    }
}
