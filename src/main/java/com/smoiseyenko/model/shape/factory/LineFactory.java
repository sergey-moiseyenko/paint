package com.smoiseyenko.model.shape.factory;

import com.smoiseyenko.model.shape.Line;
import com.smoiseyenko.gui.model.Shape;

/**
 * Created by Igor on 8/12/16.
 */
public class LineFactory implements ShapeFactory {

    private LineFactory() {}

    private static final LineFactory INSTANCE = new LineFactory();

    public static LineFactory getLineFactory() { return INSTANCE; }

    public Shape createShape() { return new Line(); }
}
