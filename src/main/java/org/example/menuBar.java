package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class menuBar extends JFrame implements ActionListener {
    JPanel panel;
    JMenuItem saveItem;
    JMenuItem openItem;
    JMenuItem exitItem;
    menuBar() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        saveItem = new JMenuItem("Save");
        saveItem.setIcon(new ImageIcon("/home/david/Downloads/icons8-save-48.png"));
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");

        saveItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);

        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);
        openItem.setMnemonic(KeyEvent.VK_O);

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

//        panel = new JPanel();
//        panel.setSize(400, 400);
//        panel.add(menuBar);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    public static void main (String [] args) {
        new menuBar();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == openItem) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            fileChooser.setCurrentDirectory(new File("//home//david//Downloads"));
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            File fileName = new File(fileChooser.getSelectedFile().getName());
            System.out.println(fileName + " : " + file);
        }
        if (a.getSource() == exitItem) {
            System.exit(0);
        }
        if (a.getSource() == saveItem) {
            JFileChooser filechooser = new JFileChooser();
            filechooser.showSaveDialog(null);
            filechooser.setCurrentDirectory(new File("//home//david//Downloads"));
        }
    }
}
