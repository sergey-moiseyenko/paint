package com.smoiseyenko.model;

import java.awt.*;

/**
 * Created by Igor on 7/24/16.
 */
public abstract class Shape {

    private int xLeft;
    private int yTop;
    private int xRight;
    private int yBottom;

    public Shape (int x, int y) {

        xLeft = x;
        yTop = y;
        xRight = x;
        yBottom = y;
    }

    public abstract  void draw(Graphics graphics);

    public void setLastCoordinate(int x, int y) {

        if (x <= xLeft) xLeft = x;
            else xRight = x;

        if (y <= yTop) yTop = y;
            else yBottom = y;
    }

    public int getXLeft() {
        return xLeft;
    }

    public int getYTop() {
        return yTop;
    }

    public int getXRight() {
        return xRight;
    }

    public int getYBottom() {
        return yBottom;
    }
}
