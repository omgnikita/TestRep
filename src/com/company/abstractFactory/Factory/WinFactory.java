package com.company.abstractFactory.Factory;

import com.company.abstractFactory.Button.Button;
import com.company.abstractFactory.Button.WinButton;
import com.company.abstractFactory.Checkbox.Checkbox;
import com.company.abstractFactory.Checkbox.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
