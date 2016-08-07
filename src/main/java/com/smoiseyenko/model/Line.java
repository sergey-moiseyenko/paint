package com.smoiseyenko.model;

import java.awt.*;

/**
 * Created by Igor on 7/29/16.
 */
public class Line extends Shape {

    public static final String NAME = "Line";

    public Line(int x, int y) { super(x, y); }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(getXLeft(), getYTop(), getXRight(), getYBottom());
    }

    @Override
    public void setLastCoordinate(int x, int y) {

        setXRight(x);
        setYBottom(y);
    }
}
