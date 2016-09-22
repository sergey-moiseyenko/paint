package com.smoiseyenko.gui.templates;

import com.smoiseyenko.gui.model.Shape;

import java.util.List;

/**
 * Created by Igor on 9/4/16.
 */
public abstract class Template extends Shape {

    private static int indexOfTemplate = 0;

    public static String getNextName() {

        indexOfTemplate++;
        return "template" + indexOfTemplate;
    }

    public abstract List<Shape> getShapes();
}
