package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MouseListener extends MouseAdapter {

    private Context context;
    private Graphics graphics;

    public MouseListener(Graphics graphics, Context context) {

        this.graphics = graphics;
        this.context = context;
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (context.getCurrentShapeName() != null) {

            Shape shape = context.createShape();

            if (shape != null) {

                shape.setFirstCoordinate(e.getX(), e.getY());
                shape.draw(graphics);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (context.getCurrentShapeName() != null) context.storeShape();
    }
}
