package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setSize(420, 420);
        this.setBackground(Color.BLACK);
        this.setResizable(false);
        this.setLocation(50, 50);
        this.setTitle("David");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("/home/david/david.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.BLUE);
        this.setVisible(false);
    }
}
