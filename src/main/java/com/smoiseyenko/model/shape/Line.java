package com.smoiseyenko.model.shape;

import java.awt.*;
import com.smoiseyenko.gui.model.Shape;

public class Line extends Shape implements Cloneable{

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

        width = lastX - xInitial;
        height = lastY - yInitial;
    }

    @Override
    public void setFirstCoordinate(int x, int y) {
        super.setFirstCoordinate(x, y);
        lastX = xInitial;
        lastY = yInitial;
    }

    private void setLastX(int lastX) { this.lastX = lastX; }

    private void setLastY(int lastY) { this.lastY = lastY; }

    @Override
    public Line clone() throws CloneNotSupportedException{

        Line line = (Line) super.clone();

        line.setLastX(this.lastX);
        line.setLastY(this.lastY);

        return line;
    }

    @Override
    public void setLeftX(int xLeft) {
        xInitial = xLeft;
    }

    @Override
    public void setTopY(int yTop) { yInitial = yTop; }

    @Override
    public void setHeight(int height) {
        lastY = yInitial + height;
    }

    @Override
    public void setWidth(int width) {
        lastX = xInitial + width;
    }
}

