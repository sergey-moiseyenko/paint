package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.Ellipse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class EllipseItemListener implements ActionListener {

    private PaintFrame frame;

    public EllipseItemListener(PaintFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        frame.setCurrentShapeName(Ellipse.NAME);
    }
}
