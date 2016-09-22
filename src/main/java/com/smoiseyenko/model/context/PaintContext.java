package com.smoiseyenko.model.context;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.utill.Collection;
import com.smoiseyenko.model.repository.ShapeRepository;
import com.smoiseyenko.model.shape.factory.ShapeFactory;
import com.smoiseyenko.model.shape.factory.TemplateFactoryBuilder;

import java.awt.Color;
import java.util.*;

/**
 * Created by Igor on 8/18/16.
 */
public class PaintContext implements Context {

    private static final PaintContext PAINT_CONTEXT = new PaintContext();
    private String currentShapeName = null;
    private Shape currentShape = null;
    private Color currentColor = Color.BLACK;
    private List<Shape> shapes = new ArrayList<Shape>();
    public static PaintContext getPaintContext() { return PAINT_CONTEXT; }
    private int width;
    private int height;

    private PaintContext(){}

    public Shape getCurrentShape() { return currentShape; }

    public void setCurrentShapeName(String shapeName) { this.currentShapeName = shapeName; }

    public Shape createShape() {

        currentShape = ShapeRepository.getShapeRepository().createShape(currentShapeName);
        currentShape.setColor(currentColor);

        return currentShape;
    }

    public void storeShape() { shapes.add(currentShape); }

    public List<Shape> getShapes() { return shapes; }

    public void setCurrentColor(Color currentColor) { this.currentColor = currentColor; }

    public String getCurrentShapeName() { return currentShapeName; }

    public void setTemplate(String name) throws CloneNotSupportedException{

        ShapeFactory factory = TemplateFactoryBuilder.builder().build(shapes);
        ShapeRepository.getShapeRepository().addTemplateFactory(name, factory);
    }

    public void setPanelSize(int width, int height) {

        this.width = width;
        this.height = height;
    }

    public int getPanelHeight() { return height; }

    public int getPanelWidth() { return width; }

    public void removeShapes() { shapes = new ArrayList<Shape>(); }
}
