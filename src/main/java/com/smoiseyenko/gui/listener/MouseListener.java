package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MouseListener extends MouseAdapter {

    private PaintFrame frame;

    public MouseListener(PaintFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mousePressed(MouseEvent e) {

        String shapeName = frame.getCurrentShapeName();

        if (shapeName != null) {

            Shape shape = null;

            if (shapeName.equals(Ellipse.NAME)) {
                shape = new Ellipse(e.getX(), e.getY());
            }

            if (shapeName.equals(Line.NAME)) {
                shape = new Line(e.getX(), e.getY());
            }

            if (shapeName.equals(Rectangle.NAME)) {
                shape = new Rectangle(e.getX(), e.getY());
            }

            if (shape != null) {
                frame.setCurrentShape(shape);
                shape.draw(frame.getGraphicsContext());
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        frame.shapeDrawingIsFinished();
    }
}
