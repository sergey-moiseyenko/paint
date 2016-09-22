package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.templates.Template;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 9/5/16.
 */
public class TemplateListener implements ActionListener{

    private Context context;

    public TemplateListener(Context context) {

        this.context = context;
    }

    public void actionPerformed(ActionEvent e) {

        context.setCurrentShapeName(e.getActionCommand());
    }
}
