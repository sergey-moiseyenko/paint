package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.templates.Template;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.List;
import java.awt.Rectangle;

public class MouseMotionListener extends MouseMotionAdapter {

    private Graphics graphics;
    private Context context;

    public MouseMotionListener(Graphics graphics, Context context) {

        this.context = context;
        this.graphics = graphics;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        if (context.getCurrentShapeName() != null) {

            Shape shape = context.getCurrentShape();

            if (shape != null) {

                shape.setLastCoordinate(e.getX(), e.getY());
                repaintPanel();
                shape.draw(graphics);
            }
        }
    }

    public void repaintPanel() {

        graphics.setColor(Color.WHITE);
        Rectangle rectangle = graphics.getClipRect();
        graphics.fillRect(0, 0, (int) rectangle.getWidth(), (int) rectangle.getHeight());

        List<Shape> shapes = context.getShapes();

        for (Shape shape : shapes) {

            shape.draw(graphics);
        }
    }
}
