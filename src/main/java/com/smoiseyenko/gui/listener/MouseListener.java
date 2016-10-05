package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.command.Command;
import com.smoiseyenko.gui.command.CommandHistory;
import com.smoiseyenko.gui.command.InsertCommand;
import com.smoiseyenko.gui.model.Shape;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MouseListener extends MouseAdapter {

    private Context context;
    private Graphics graphics;
    private CommandHistory commandHistory;
    private Shape shape;

    public MouseListener(Graphics graphics, Context context, CommandHistory commandHistory) {

        this.graphics = graphics;
        this.context = context;
        this.commandHistory = commandHistory;
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (context.getCurrentShapeName() != null) {

            shape = context.createShape();

            if (shape != null) {

                shape.setFirstCoordinate(e.getX(), e.getY());
                shape.setCoefficient(context.getPanelWidth(), context.getPanelHeight());
                shape.draw(graphics);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (context.getCurrentShapeName() != null) {

            Command editCommand = new InsertCommand(shape, context);
            commandHistory.addCommand(editCommand);
            context.storeShape();
        }
    }
}
