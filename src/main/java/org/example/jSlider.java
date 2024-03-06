package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class jSlider extends JFrame implements ChangeListener {
    JSlider slider;
    JLabel label;
    JPanel panel;
    jSlider() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.setText("Value of slider :" + "0");
        label.setBackground(Color.gray);

        slider = new JSlider(JSlider.VERTICAL, 0, 100, 50);
//        slider.setOrientation(JSlider.HORIZONTAL);
        slider.setPreferredSize(new Dimension(400, 50));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.addChangeListener(this);

        panel = new JPanel();
        panel.add(slider);
        panel.add(label);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent a) {
        if (a.getSource() == slider) {
            label.setText("Value of slider: " + slider.getValue());
        }
    }
    public static void main (String[] args) {
        new jSlider();
    }
}
