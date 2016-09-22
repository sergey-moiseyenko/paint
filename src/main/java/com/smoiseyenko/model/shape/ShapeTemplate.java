package com.smoiseyenko.model.shape;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.templates.Template;
import com.smoiseyenko.gui.utill.Collection;

import java.awt.*;
import java.util.List;

/**
 * Created by Igor on 9/4/16.
 */
public class ShapeTemplate extends Template {

    private List<Shape> shapes;

    public ShapeTemplate(List<Shape> shapes) {

        this.shapes = shapes;
    }

    @Override
    public void draw(Graphics graphics) {

        setWidthHeightAndTopLeftCoordinateOfShape();
        for (Shape shape : shapes) shape.draw(graphics);
    }

    @Override
    public void setCoefficient(double panelWidth, double panelHeight) {

        for (Shape shape : shapes) {

           shape.setCoefficient(panelWidth, panelHeight);
        }
    }

    public void setShapes(List<Shape> shapes) { this.shapes = shapes; }

    public List<Shape> getShapes() {
        return shapes;
    }

    @Override
    public ShapeTemplate clone() throws CloneNotSupportedException {

        ShapeTemplate shapeTemplate = (ShapeTemplate) super.clone();
        shapeTemplate.setShapes(Collection.copy(getShapes()));

        return shapeTemplate;
    }

    private void setWidthHeightAndTopLeftCoordinateOfShape() {

        for (Shape shape : shapes) {

            shape.setLeftX(getLeftX() + (int)(getWidth() * shape.getWidthCoefficientForTopLeftPoint()));
            shape.setTopY(getTopY() + (int)(getHeight() * shape.getHeightCoefficientForTopLeftPoint()));
            shape.setWidth((int)(getWidth() * shape.getWidthCoefficient()));
            shape.setHeight((int)(getHeight() * shape.getHeightCoefficient()));
        }
    }
}
