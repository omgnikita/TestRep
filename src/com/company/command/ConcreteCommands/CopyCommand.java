package com.company.command.ConcreteCommands;

import com.company.command.Application;
import com.company.command.EditorAndHistory.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.clipboard = editor.getSelection();
        return false;
    }
}
