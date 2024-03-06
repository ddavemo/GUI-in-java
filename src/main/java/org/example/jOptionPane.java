package org.example;

import javax.swing.*;

public class jOptionPane {
    public static void main (String [] args) {
//        JOptionPane.showMessageDialog(null, "Hello", "Error", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello", "Error", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello", "Error", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello", "Error", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello", "Error", JOptionPane.WARNING_MESSAGE);

//        System.out.println(JOptionPane.showConfirmDialog(null, "Hello", "confirm", JOptionPane.YES_NO_CANCEL_OPTION));

//        System.out.println(JOptionPane.showInputDialog(null, "What is your name", "somebarry"));

        String[] responses = {"Yeah", "Nope", "This is what i was talkin about"};
        JOptionPane.showOptionDialog(null,
                "hello there",
                "greeting",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("/home/david/david.jpg"),
                responses,
                0);
    }
}
