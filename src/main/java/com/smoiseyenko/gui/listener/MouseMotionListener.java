package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.Shape;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionListener extends MouseMotionAdapter {

    private PaintFrame frame;

    public MouseMotionListener(PaintFrame paintFrame) {

        this.frame = paintFrame;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        Shape shape = frame.getCurrentShape();

        if (shape != null) {
            shape.setLastCoordinate(e.getX(), e.getY());

            frame.repaintPanel();
            shape.draw(frame.getGraphicsContext());
        }
    }
}
