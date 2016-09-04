package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.context.Context;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 8/25/16.
 */
public class ChooseColorListener implements ActionListener {

    private JColorChooser chooser = new JColorChooser();
    private JPanel panel;
    private Context context;

    public ChooseColorListener(JPanel panel, Context context) {

       this.panel = panel;
       this.context = context;
    }

    public void actionPerformed(ActionEvent e) {

        Color color = chooser.showDialog(panel, "Choose the color", panel.getBackground());
        context.setCurrentColor(color);
    }
}
