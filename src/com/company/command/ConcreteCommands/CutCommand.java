package com.company.command.ConcreteCommands;

import com.company.command.Application;
import com.company.command.EditorAndHistory.Editor;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
   public boolean execute() {
        saveBackup();
        app.clipboard = editor.getSelection();
        return true;
    }
}
