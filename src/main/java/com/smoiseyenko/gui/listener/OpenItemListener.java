package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;
import com.smoiseyenko.gui.serialization.ShapesFileSerializer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

/**
 * Created by Igor on 7/24/16.
 */
public class OpenItemListener implements ActionListener {

    private ShapesFileSerializer serializableToFile;
    private Context context;

    public OpenItemListener (ShapesFileSerializer serializableToFile, Context context) {
        this.serializableToFile = serializableToFile;
        this.context = context;
    }

    public void actionPerformed(ActionEvent e) {

        String fileName = fileOpenDialog();

        while(fileName == null || "".equals(fileName)) {
            fileName = fileOpenDialog();
        }
        context.setCurrentFileName(fileName);

        try {
            List<Shape> shapes = serializableToFile.deserializeShapes(fileName);
            if (shapes != null) {
                context.setShapes(shapes);
                context.repaintPanel();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private String fileOpenDialog () {
        return JOptionPane.showInputDialog(null, "Enter the correct file name to open");
    }
}

