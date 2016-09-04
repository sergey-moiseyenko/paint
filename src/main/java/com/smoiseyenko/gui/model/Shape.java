package com.smoiseyenko.gui.model;

import java.awt.*;

/**
 * Created by Igor on 7/24/16.
 */
public abstract class Shape {

    protected int xInitial;
    protected int yInitial;

    private int xLeft;
    private int yTop;
    private int width;
    private int height;

    private Color color;

    public abstract void draw(Graphics graphics);

    public void setFirstCoordinate(int x, int y) {

        xInitial = xLeft = x;
        yInitial = yTop = y;
        width = 0;
        height = 0;
    }

    public void setLastCoordinate(int x, int y) {

        width = Math.abs(x - xInitial);
        height = Math.abs(y - yInitial);
        if (x <= xInitial) xLeft = x;
        if (y <= yInitial) yTop = y;
    }

    public int getXLeft() {
        return xLeft;
    }

    public int getYTop() {
        return yTop;
    }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public void setColor(Color shapeColor) { color = shapeColor; }

    public Color getColor() { return color; }
}
