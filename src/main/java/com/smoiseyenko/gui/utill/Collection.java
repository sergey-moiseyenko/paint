package com.smoiseyenko.gui.utill;

import com.smoiseyenko.gui.model.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 9/21/16.
 */
public class Collection {

    public static List<Shape> copy(List<Shape> shapes) throws CloneNotSupportedException {

        List<Shape> shapesToReturn = new ArrayList<Shape>();

        for (Shape shape : shapes) {
            shapesToReturn.add(shape.clone());
        }

        return shapesToReturn;
    }
}
