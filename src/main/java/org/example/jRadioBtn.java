package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jRadioBtn extends JFrame implements ActionListener {
    JRadioButton pizaaBtn;
    JRadioButton hotdogBtn;
    JRadioButton hambugerBtn;

    jRadioBtn() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizaaBtn = new JRadioButton("pizaa");
        hotdogBtn = new JRadioButton("hotdog");
        hambugerBtn = new JRadioButton("hambuger");

        pizaaBtn.addActionListener(this);
        hotdogBtn.addActionListener(this);
        hambugerBtn.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(pizaaBtn);
        group.add(hotdogBtn);
        group.add(hambugerBtn);

        this.add(pizaaBtn);
        this.add(hambugerBtn);
        this.add(hotdogBtn);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == pizaaBtn) {
            System.out.println("Pizaa");
        }
        if(a.getSource() == hotdogBtn) {
            System.out.println("Hotdog");
        }
        if(a.getSource() == hambugerBtn) {
            System.out.println("Hambuger");
        }
    }

    public static void main (String [] args) {
        new jRadioBtn();
    }
}
