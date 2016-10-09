package com.smoiseyenko.model.shape.factory;

import com.smoiseyenko.model.shape.Rectangle;

/**
 * Created by Igor on 8/12/16.
 */
public class RectangleFactory implements ShapeFactory {

    private RectangleFactory() {}

    private static final RectangleFactory INSTANCE = new RectangleFactory();

    public static RectangleFactory getRectangleFactory() { return INSTANCE; }

    public Rectangle createShape() { return new Rectangle(); }
}
