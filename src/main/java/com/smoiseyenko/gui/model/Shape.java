package com.smoiseyenko.gui.model;

import java.awt.*;
import java.io.Serializable;

/**
 * Created by Igor on 7/24/16.
 */
public abstract class Shape implements Cloneable, Serializable {

    private int xLeft;
    private int yTop;
    protected int width;
    protected int height;

    private double widthCoefficient;
    private double heightCoefficient;
    private double widthCoefficientForTopLeftPoint;
    private double heightCoefficientForTopLeftPoint;

    protected int xInitial;
    protected int yInitial;

    private Color color;

    public void draw(Graphics graphics) {}

    public void setFirstCoordinate(int x, int y) {

        xInitial = x;
        yInitial = y;
        xLeft = x;
        yTop = y;

        width = 0;
        height = 0;
    }

    public void setLastCoordinate(int x, int y) {

        width = Math.abs(x - xInitial);
        height = Math.abs(y - yInitial);
        if (x <= xInitial) xLeft = x;
        if (y <= yInitial) yTop = y;
    }

    public void setColor(Color shapeColor) {
        color = shapeColor;
    }

    public void setCoefficient(double panelWidth, double panelHeight) {

        widthCoefficient = width / panelWidth;
        heightCoefficient = height / panelHeight;
        widthCoefficientForTopLeftPoint = xLeft / panelWidth;
        heightCoefficientForTopLeftPoint = yTop / panelHeight;
    }

    public void setLeftX(int xLeft) {
        this.xLeft = xLeft;
    }

    public void setTopY(int yTop) {
        this.yTop = yTop;
    }

    public int getWidth () { return this.width; }

    public int getHeight () { return this.height; }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHeightCoefficient(double heightCoefficient) {
        this.heightCoefficient = heightCoefficient;
    }

    public void setWidthCoefficient(double widthCoefficient) {
        this.widthCoefficient = widthCoefficient;
    }

    public void setWidthCoefficientForTopLeftPoint(double widthCoefficientForTopLeftPoint) {
        this.widthCoefficientForTopLeftPoint = widthCoefficientForTopLeftPoint;
    }

    public void setHeightCoefficientForTopLeftPoint(double heightCoefficientForTopLeftPoint) {
        this.heightCoefficientForTopLeftPoint = heightCoefficientForTopLeftPoint;
    }

    public int getLeftX() {
        return xLeft;
    }

    public int getTopY() {
        return yTop;
    }

    public Color getColor() {
        return color;
    }

    public double getHeightCoefficient() {
        return heightCoefficient;
    }

    public double getWidthCoefficient() {
        return widthCoefficient;
    }

    public double getHeightCoefficientForTopLeftPoint() {
        return heightCoefficientForTopLeftPoint;
    }

    public double getWidthCoefficientForTopLeftPoint() {
        return widthCoefficientForTopLeftPoint;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {

        Shape shape = (Shape) super.clone();

        shape.setHeight(height);
        shape.setWidth(width);
        shape.setLeftX(getLeftX());
        shape.setTopY(getTopY());
        shape.setHeightCoefficient(getHeightCoefficient());
        shape.setWidthCoefficient(getWidthCoefficient());
        shape.setHeightCoefficientForTopLeftPoint(getHeightCoefficientForTopLeftPoint());
        shape.setWidthCoefficientForTopLeftPoint(getWidthCoefficientForTopLeftPoint());

        return shape;
    }
}


