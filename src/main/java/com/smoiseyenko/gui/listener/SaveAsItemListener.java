package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.serialization.ShapesFileSerializer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

/**
 * Created by Igor on 7/24/16.
 */
public class SaveAsItemListener implements ActionListener, Serializable{

    private ShapesFileSerializer serializableToFile;
    private Context context;

    public SaveAsItemListener(ShapesFileSerializer serializableToFile, Context context) {

        this.serializableToFile = serializableToFile;
        this.context = context;
    }

    public void actionPerformed(ActionEvent e) {

        String fileName = "";

        while(fileName == null || "".equals(fileName)) {
            fileName = JOptionPane.showInputDialog(null, "Save as : ");
        }
        context.setCurrentFileName(fileName);

        List<Shape> shapes = context.getShapes();
        if (shapes != null) {
            try {
                serializableToFile.serializeShapes(fileName, shapes);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
