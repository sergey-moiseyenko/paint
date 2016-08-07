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
    private int xPress;
    private int yPress;

    public Shape (int x, int y) {

        xLeft = x;
        yTop = y;
        xRight = x;
        yBottom = y;
        xPress = x;
        yPress = y;
    }

    public abstract void draw(Graphics graphics);

    public void setLastCoordinate(int x, int y) {

        if (x >= xPress) xRight = x;
        else if (x <= xPress) xLeft = x;

        if (y >= yPress) yBottom = y;
        else if (y <= yPress) yTop = y;
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

    public void setXRight(int xRight) {this.xRight = xRight;}

    public void setYBottom(int yBottom) {this.yBottom = yBottom;}
}
