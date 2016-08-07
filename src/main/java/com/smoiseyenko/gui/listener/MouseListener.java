package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.model.*;
import com.smoiseyenko.model.Rectangle;
import com.smoiseyenko.model.Shape;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MouseListener extends MouseAdapter {

    private String nameOfShape;
    private static Shape shape;
    private PaintFrame paintFrame;

    public MouseListener(PaintFrame paintFrame) {

        this.paintFrame = paintFrame;
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (nameOfShape != null) {

            if (nameOfShape.equals(Ellipse.NAME)) {

                Ellipse ellipse = new Ellipse(e.getX(), e.getY());
                shape = ellipse;
            }

            if (nameOfShape.equals(Line.NAME)) {

                Line line = new Line(e.getX(), e.getY());
                shape = line;
            }

            if (nameOfShape.equals(Rectangle.NAME)) {

                Rectangle rectangle = new Rectangle(e.getX(), e.getY());
                shape = rectangle;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        paintFrame.shapeWasCreated(shape);
    }

    public void setNameOfShape(String nameOfShape) {

        this.nameOfShape = nameOfShape;
    }

    public static Shape getShape() {

        return shape;
    }
}
