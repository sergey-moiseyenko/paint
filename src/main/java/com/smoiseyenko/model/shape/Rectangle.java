package com.smoiseyenko.model.shape;

import java.awt.*;
import com.smoiseyenko.gui.model.Shape;

/**
 * Created by Igor on 7/24/16.
 */

public class Rectangle extends Shape implements Cloneable{

    public void draw(Graphics graphics) {

        graphics.setColor(getColor());
        graphics.drawRect(getLeftX(), getTopY(), getWidth(), getHeight());
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException{
        return (Rectangle) super.clone();
    }
}
