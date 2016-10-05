package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

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
                context.repaintPanel();
                shape.draw(graphics);
            }
        }
    }
}
