package com.smoiseyenko.gui.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class AboutItemListener implements ActionListener {

    private JFrame frame;

    public AboutItemListener(JFrame frame) {

        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(frame, "<html>Paint provides you with ShapesSerializer set of tools " +
                "<br> with which you can draw any shape.");
    }
}
