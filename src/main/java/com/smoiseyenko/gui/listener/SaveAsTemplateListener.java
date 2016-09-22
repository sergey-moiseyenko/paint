package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;
import com.smoiseyenko.gui.templates.Template;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 9/4/16.
 */
public class SaveAsTemplateListener implements ActionListener {

    private Context context;
    private JMenu menu;
    private ActionListener listener;

    public SaveAsTemplateListener(Context context, JMenu menu) {

        this.context = context;
        this.menu = menu;
        listener = new TemplateListener(context);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            String name = Template.getNextName();
            context.setTemplate(name);
            JMenuItem templateItem = new JMenuItem(name);
            templateItem.addActionListener(listener);
            menu.add(templateItem);
        }catch (CloneNotSupportedException ex) {

        }
    }
}
