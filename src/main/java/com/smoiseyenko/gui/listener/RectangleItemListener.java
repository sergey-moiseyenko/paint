package com.smoiseyenko.gui.listener;

import com.smoiseyenko.model.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class RectangleItemListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
