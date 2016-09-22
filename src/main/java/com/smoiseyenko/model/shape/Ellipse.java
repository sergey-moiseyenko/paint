package com.smoiseyenko.model.shape;

import java.awt.*;
import com.smoiseyenko.gui.model.Shape;

public class Ellipse extends Shape implements Cloneable{

    public void draw(Graphics graphics) {

        graphics.setColor(getColor());
        graphics.drawOval(getLeftX(), getTopY(), getWidth(), getHeight());
    }

    @Override
    public Ellipse clone() throws CloneNotSupportedException{
        return (Ellipse) super.clone();
    }
}
