package com.smoiseyenko.gui.command;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.model.Shape;

/**
 * Created by Igor on 9/29/16.
 */
public class InsertCommand implements Command {

    private Shape shape;
    private Context context;

    public InsertCommand(Shape shape, Context context) {

        this.shape = shape;
        this.context = context;
    }

    public void undo() {

        context.removeShape(shape);
        context.repaintPanel();
    }

    public void redo() {

        context.addShape(shape);
        context.repaintPanel();
    }
}
