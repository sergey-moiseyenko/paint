package com.smoiseyenko.model.repository;

import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.repository.Repository;
import com.smoiseyenko.model.shape.factory.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Igor on 8/18/16.
 */
public class ShapeRepository implements Repository {

    public static final String LINE_NAME = "Line";
    public static final String ELLIPSE_NAME = "Ellipse";
    public static final String RECTANGLE_NAME = "Rectangle";

    private static final ShapeRepository SHAPE_REPOSITORY = new ShapeRepository();
    private Map<String, ShapeFactory> map = initShapeFactories();

    public static ShapeRepository getShapeRepository() { return SHAPE_REPOSITORY; }

    private ShapeRepository() {}

    private Map<String, ShapeFactory> initShapeFactories() {

        Map<String, ShapeFactory> map = new HashMap<String, ShapeFactory>();
        map.put(LINE_NAME, LineFactory.getLineFactory());
        map.put(ELLIPSE_NAME, EllipseFactory.getEllipseFactory());
        map.put(RECTANGLE_NAME, RectangleFactory.getRectangleFactory());

        return map;
    }

    public Shape createShape(String shapeName) { return map.get(shapeName).createShape(); }

    public void addTemplateFactory(String name, ShapeFactory factory) {
        map.put(name, factory);
    }
}
