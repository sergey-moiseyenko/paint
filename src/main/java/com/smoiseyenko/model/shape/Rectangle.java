package com.smoiseyenko.model.shape;

import java.awt.*;
import com.smoiseyenko.gui.model.Shape;

/**
 * Created by Igor on 7/24/16.
 */

public class Rectangle extends Shape {

    public void draw(Graphics graphics) {

        graphics.setColor(getColor());
        graphics.drawRect(getXLeft(), getYTop(), getWidth(), getHeight());
    }
}
