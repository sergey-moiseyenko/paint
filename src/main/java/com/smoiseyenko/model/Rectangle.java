package com.smoiseyenko.model;

import java.awt.*;

/**
 * Created by Igor on 7/24/16.
 */
public class Rectangle extends Shape {

    public static final String NAME = "Rectangle";

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public void draw(Graphics graphics) {
        graphics.drawRect(getXLeft(), getYTop(), getXRight() - getXLeft(), getYBottom() - getYTop());
    }
}
