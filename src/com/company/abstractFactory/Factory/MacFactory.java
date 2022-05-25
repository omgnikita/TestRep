package com.company.abstractFactory.Factory;

import com.company.abstractFactory.Button.Button;
import com.company.abstractFactory.Button.MacButton;
import com.company.abstractFactory.Checkbox.Checkbox;
import com.company.abstractFactory.Checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
