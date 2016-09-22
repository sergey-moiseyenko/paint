package com.smoiseyenko.gui.repository;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.model.shape.factory.ShapeFactory;


/**
 * Created by Igor on 8/19/16.
 */
public interface Repository {

    Shape createShape(String shapeName);
    void addTemplateFactory(String name, ShapeFactory factory);
}
