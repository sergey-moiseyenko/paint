package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.Ellipse;
import com.smoiseyenko.model.Line;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class LineItemListener implements ActionListener {

    private PaintFrame frame;

    public LineItemListener(PaintFrame frame) {

        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        frame.setName(Line.NAME);
    }
}
