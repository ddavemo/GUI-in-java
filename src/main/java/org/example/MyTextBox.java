package org.example;
import javax.swing.*;
import java.awt.*;


public class MyTextBox {
    public static void main (String [] args) {
        JFrame frame = new JFrame();
        JTextField text = new JFormattedTextField();



        frame.setSize(400, 400);
        frame.add(text);
        frame.setVisible(true);
    }
}
