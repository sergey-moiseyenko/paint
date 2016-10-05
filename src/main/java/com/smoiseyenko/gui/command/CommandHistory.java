package com.smoiseyenko.gui.command;

import java.util.Stack;

/**
 * Created by Igor on 9/29/16.
 */
public class CommandHistory {

    private Stack<Command> undoCommands = new Stack<Command>();
    private Stack<Command> redoCommands = new Stack<Command>();
    private static CommandHistory commandHistory;

    private CommandHistory() {}

    public static CommandHistory getCommandHistory() {

        if (commandHistory == null) commandHistory = new CommandHistory();

        return commandHistory;
    }

    public void addCommand(Command command) { undoCommands.push(command); }

    public void undo() {

        if (!undoCommands.isEmpty()) {

            Command command = undoCommands.pop();
            command.undo();
            redoCommands.push(command);
        }
    }

    public void redo() {

        if (!redoCommands.isEmpty()) {

            Command command = redoCommands.pop();
            command.redo();
            undoCommands.push(command);
        }
    }
}
