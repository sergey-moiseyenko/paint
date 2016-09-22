package com.smoiseyenko.model.shape.factory;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.templates.Template;

import java.util.List;

/**
 * Created by Igor on 8/12/16.
 */
public interface ShapeFactory {

    Shape createShape(); //throws CloneNotSupportedException;
    //Template createTemplate(List<Shape> shapes);
}
