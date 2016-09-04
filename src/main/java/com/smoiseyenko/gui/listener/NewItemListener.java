package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.PaintFrame;
import com.smoiseyenko.gui.context.Context;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class NewItemListener implements ActionListener {

    private Graphics graphics;
    private Context context;
    private PaintFrame frame;

    public NewItemListener(Graphics graphics, Context context, PaintFrame frame) {

        this.graphics = graphics;
        this.context = context;
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {

        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure to want to delete current changes?");

        if (choice == JOptionPane.YES_OPTION){

            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, (int)graphics.getClipRect().getWidth(), (int)graphics.getClipRect().getHeight());
            graphics.setColor(Color.BLACK);
            context.setCurrentShapeName(null);
            context.setCurrentColor(Color.BLACK);
            context.getShapes().removeAll(context.getShapes());
        }
    }
}
