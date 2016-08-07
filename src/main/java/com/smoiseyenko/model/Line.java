package com.smoiseyenko.model;

import java.awt.*;

/**
 * Created by Igor on 7/29/16.
 */
public class Line extends Shape {

    public static final String NAME = "Line";

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x, int y) {

        super(x, y);
        x1 = x;
        y1 = y;
        x2 = x;
        y2 = y;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void setLastCoordinate(int x, int y) {

        x2 = x;
        y2 = y;
    }
}
