package com.smoiseyenko.model.shape;

import java.awt.*;
import com.smoiseyenko.gui.model.Shape;

public class Ellipse extends Shape {

    public void draw(Graphics graphics) {

        graphics.setColor(getColor());
        graphics.drawOval(getXLeft(), getYTop(), getWidth(), getHeight());
    }
}
