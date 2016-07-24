package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class NewItemListener implements ActionListener {

    private JFrame frame;

    public NewItemListener(JFrame frame) {

        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure to want to delete current changes?");

        if (choice == JOptionPane.YES_OPTION){

            frame.setVisible(false);
            new PaintFrame();
        }
    }
}
