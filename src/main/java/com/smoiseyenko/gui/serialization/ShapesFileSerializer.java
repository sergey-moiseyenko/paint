package com.smoiseyenko.gui.serialization;

import com.smoiseyenko.gui.model.Shape;

import java.io.*;
import java.util.List;

/**
 * Created by Igor on 10/7/16.
 */
public class ShapesFileSerializer {

    private static ShapesFileSerializer INSTANCE;

    private ShapesFileSerializer() {}

    public void serializeShapes(String fileName, List<Shape> shapes) throws IOException {

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(shapes);
        } finally {
            if (oos != null) oos.close();
        }
    }

    public List<Shape> deserializeShapes(String fileName) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            List<Shape> shapes = (List<Shape>) ois.readObject();
            ois.close();
            return shapes;
        } finally {
            if (ois != null) ois.close();
        }
    }

    public static ShapesFileSerializer getInstance() {

        if (INSTANCE == null) INSTANCE = new ShapesFileSerializer();

        return INSTANCE;
    }
}
