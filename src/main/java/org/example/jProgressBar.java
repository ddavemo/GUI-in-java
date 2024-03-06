package org.example;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class jProgressBar extends JFrame implements ChangeListener {
    JProgressBar progress;
    JPanel panel;
    jProgressBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        progress = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
        progress.setPreferredSize(new Dimension(400, 20));
        progress.setForeground(Color.green);
        progress.setStringPainted(true);
        progress.setValue(50);
        progress.setBorder(new BevelBorder(BevelBorder.RAISED));

        panel = new JPanel();
        panel.add(progress);
        this.add(panel);
        this.pack();
        this.setVisible(true);
        fill();
    }
    public void fill() {
        int counter = 100;
        while (counter >= 0) {
            progress.setValue(counter);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter -= 1;
        }
        while (counter <=100) {
            progress.setValue(counter);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 1;
        }
        progress.setString("Done");
    }
    @Override
    public void stateChanged(ChangeEvent a) {

    }

    public static void main(String [] args) {
        new jProgressBar();
    }
}
