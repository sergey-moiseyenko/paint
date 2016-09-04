package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 8/14/16.
 */
public class InsertMenuItemListener implements ActionListener{

    private Context context;

    public InsertMenuItemListener(Context context) {

        this.context = context;
    }

    public void actionPerformed(ActionEvent e) {

        context.setCurrentShapeName(e.getActionCommand());
    }
}
