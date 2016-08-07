package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.*;
import com.smoiseyenko.model.Rectangle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;



public class MouseMotionListener extends MouseMotionAdapter {

    private String nameOfShape;
    private PaintFrame paintFrame;

    public MouseMotionListener(PaintFrame paintFrame) {

        this.paintFrame = paintFrame;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        paintFrame.repaintPanel();

        if (nameOfShape != null) {

            if (nameOfShape.equals(Ellipse.NAME)) {

                Ellipse ellipse = (Ellipse) MouseListener.getShape();
                ellipse.setLastCoordinate(e.getX(), e.getY());
                ellipse.draw(paintFrame.getGraphicsContext());
            }

            if (nameOfShape.equals(Line.NAME)) {

                Line line = (Line) MouseListener.getShape();
                line.setLastCoordinates(e.getX(), e.getY());
                line.draw(paintFrame.getGraphicsContext());
            }

            if (nameOfShape.equals(Rectangle.NAME)) {

                Rectangle rectangle = (Rectangle) MouseListener.getShape();
                rectangle.setLastCoordinate(e.getX(), e.getY());
                rectangle.draw(paintFrame.getGraphicsContext());
            }
        }
    }

    public void setNameOfShape(String nameOfShape) {

        this.nameOfShape = nameOfShape;
    }
}
