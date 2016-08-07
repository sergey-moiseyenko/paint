package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.Rectangle;

import java.awt.event.*;

/**
 * Created by Igor on 7/24/16.
 */
public class RectangleItemListener implements ActionListener {

    private PaintFrame frame;

    public RectangleItemListener(PaintFrame frame) {

        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        frame.setCurrentShapeName(Rectangle.NAME);
    }
}
