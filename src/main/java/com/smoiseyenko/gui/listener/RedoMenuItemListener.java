package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.command.CommandHistory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 9/28/16.
 */
public class RedoMenuItemListener implements ActionListener{

    private CommandHistory commandHistory;

    public RedoMenuItemListener(CommandHistory commandHistory) { this.commandHistory = commandHistory; }

    public void actionPerformed(ActionEvent e) { commandHistory.redo(); }
}
