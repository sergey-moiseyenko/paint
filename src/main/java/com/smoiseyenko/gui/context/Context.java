package com.smoiseyenko.gui.context;

import com.smoiseyenko.gui.model.Shape;

import java.awt.*;

/**
 * Created by Igor on 8/19/16.
 */
public interface Context {

    void setCurrentShapeName(String shapeName);
    String getCurrentShapeName();
    Shape getCurrentShape();
    Shape createShape();
    void storeShape();
    void setCurrentColor(Color currentColor);
    void setTemplate(String name) throws CloneNotSupportedException;
    void setPanelSize(int width, int height);
    int getPanelWidth();
    int getPanelHeight();
    void removeShapes();
    void setGraphics(Graphics graphics);
    void repaintPanel();
    void removeShape(Shape shape);
    void addShape(Shape shape);
}
