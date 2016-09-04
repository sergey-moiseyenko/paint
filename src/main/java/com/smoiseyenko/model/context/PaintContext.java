package com.smoiseyenko.model.context;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.model.repository.ShapeRepository;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Igor on 8/18/16.
 */
public class PaintContext implements Context {

    private static final PaintContext PAINT_CONTEXT = new PaintContext();
    private String currentShapeName = null;
    private Shape currentShape;
    private Color currentColor = Color.BLACK;
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public static PaintContext getPaintContext() { return PAINT_CONTEXT; }

    private PaintContext(){}

    public Shape getCurrentShape() { return currentShape; }

    public void setCurrentShapeName(String shapeName) { this.currentShapeName = shapeName; }

    public Shape createShape() {

        currentShape = ShapeRepository.getShapeRepository().createShape(currentShapeName);
        currentShape.setColor(currentColor);

        return currentShape;
    }

    public void storeShape() { shapes.add(currentShape); }

    public ArrayList<Shape> getShapes() { return shapes; }

    public void setCurrentColor(Color currentColor) { this.currentColor = currentColor; }

    public String getCurrentShapeName() { return currentShapeName; }
}
