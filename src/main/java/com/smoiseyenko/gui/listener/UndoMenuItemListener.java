package com.smoiseyenko.gui.listener;

import com.smoiseyenko.gui.command.CommandHistory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Igor on 10/3/16.
 */
public class UndoMenuItemListener implements ActionListener{

    private CommandHistory commandHistory;

    public UndoMenuItemListener(CommandHistory commandHistory) { this.commandHistory = commandHistory; }

    public void actionPerformed(ActionEvent e) { commandHistory.undo(); }
}
