package com.smoiseyenko.model;

import java.awt.*;

/**
 * Created by Igor on 7/24/16.
 */
public class Ellipse implements Shape{

    public static final String NAME = "Ellipse";
    private int xLeft;
    private int yTop;
    private int xRight;
    private int yBottom;

    public Ellipse(int x, int y) {

        xLeft = x;
        yTop = y;
        xRight = x;
        yBottom = y;
    }

    public void draw(Graphics graphics) {

       graphics.drawOval(xLeft, yTop, xRight - xLeft, yBottom - yTop);
    }

    public void setLastCoordinate(int x, int y) {

        if (x <= xLeft) xLeft = x;
        else xRight = x;

        if (y <= yTop) yTop = y;
        else yBottom = y;
    }
}
