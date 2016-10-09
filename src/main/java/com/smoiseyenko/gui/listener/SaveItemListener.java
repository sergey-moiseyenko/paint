package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.serialization.ShapesFileSerializer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Igor on 7/24/16.
 */
public class SaveItemListener implements ActionListener {

    private ShapesFileSerializer serializableToFile;
    private Context context;

    public SaveItemListener(ShapesFileSerializer serializableToFile, Context context) {

        this.serializableToFile = serializableToFile;
        this.context = context;
    }

    public void actionPerformed(ActionEvent e) {

        if (context.getCurrentFileName() != null) {
            try {
                serializableToFile.serializeShapes(context.getCurrentFileName(), context.getShapes());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
