package com.company.command;

import com.company.command.ConcreteCommands.Command;
import com.company.command.EditorAndHistory.CommandHistory;
import com.company.command.EditorAndHistory.Editor;

import java.util.List;

public class Application {
    public String clipboard;

    public List<Editor> editors;

    public Editor activeEditor;

    public CommandHistory history;

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
