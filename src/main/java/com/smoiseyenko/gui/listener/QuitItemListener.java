package com.smoiseyenko.gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class QuitItemListener implements ActionListener{

    private JFrame frame;

    public QuitItemListener(JFrame frame) {

        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        int choice = JOptionPane.showConfirmDialog(frame, "You want to exit?");

        if (choice == JOptionPane.YES_OPTION) System.exit(0);
    }
}
