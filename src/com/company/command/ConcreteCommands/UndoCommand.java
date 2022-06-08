package com.company.command.ConcreteCommands;

import com.company.command.Application;
import com.company.command.EditorAndHistory.Editor;

public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}
