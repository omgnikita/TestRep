package com.company.abstractFactory.Factory;

import com.company.abstractFactory.Button.Button;
import com.company.abstractFactory.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
