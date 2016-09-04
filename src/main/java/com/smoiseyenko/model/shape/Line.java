package com.smoiseyenko.model.shape;

import java.awt.*;
import com.smoiseyenko.gui.model.Shape;

public class Line extends Shape {

    private int lastX;
    private int lastY;

    @Override
    public void draw(Graphics graphics) {

        graphics.setColor(getColor());
        graphics.drawLine(xInitial, yInitial, lastX, lastY);
    }

    @Override
    public void setLastCoordinate(int x, int y) {

        lastX = x;
        lastY = y;
    }

    @Override
    public void setFirstCoordinate(int x, int y) {
        super.setFirstCoordinate(x, y);
        lastX = xInitial;
        lastY = yInitial;
    }
}
