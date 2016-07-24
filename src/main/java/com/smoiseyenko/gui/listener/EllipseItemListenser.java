package com.smoiseyenko.gui.listener;

import com.smoiseyenko.model.Ellipse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class EllipseItemListenser implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Ellipse ellipse = new Ellipse();
        ellipse.draw();
    }
}
