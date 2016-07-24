package com.smoiseyenko.gui.listener;

import com.smoiseyenko.model.Pencil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 7/24/16.
 */
public class PencilItemListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Pencil pencil = new Pencil();
        pencil.draw();
    }
}
