package com.smoiseyenko.model.shape.factory;

import com.smoiseyenko.model.shape.Ellipse;
import com.smoiseyenko.gui.model.Shape;

/**
 * Created by Igor on 8/12/16.
 */
public class EllipseFactory implements ShapeFactory {

    private EllipseFactory() {}

    private static final EllipseFactory INSTANCE = new EllipseFactory();

    public static EllipseFactory getEllipseFactory() { return INSTANCE; }

    public Shape createShape() {
        return new Ellipse();
    }
}
