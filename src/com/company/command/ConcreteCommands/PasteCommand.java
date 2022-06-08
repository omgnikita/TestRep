package com.company.command.ConcreteCommands;

import com.company.command.Application;
import com.company.command.EditorAndHistory.Editor;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }
}
