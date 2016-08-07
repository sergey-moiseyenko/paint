package com.smoiseyenko.model;

import java.awt.*;

/**
 * Created by Igor on 7/24/16.
 */
public class Ellipse extends Shape {

    public static final String NAME = "Ellipse";

    public Ellipse(int x, int y) {
        super(x, y);
    }

    public void draw(Graphics graphics) {
       graphics.drawOval(getXLeft(), getYTop(), getXRight() - getXLeft(), getYBottom() - getYTop());
    }
}
