package com.smoiseyenko.gui.context;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.templates.Template;

import java.awt.*;
import java.util.List;

/**
 * Created by Igor on 8/19/16.
 */
public interface Context {

    void setCurrentShapeName(String shapeName);
    String getCurrentShapeName();
    Shape getCurrentShape();
    Shape createShape();
    void storeShape();
    List<Shape> getShapes();
    void setCurrentColor(Color currentColor);
    void setTemplate(String name) throws CloneNotSupportedException;
    void setPanelSize(int width, int height);
    int getPanelWidth();
    int getPanelHeight();
    void removeShapes();
}
