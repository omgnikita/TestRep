package com.company.factoryMethod.Dialog;

import com.company.factoryMethod.Button.Button;
import com.company.factoryMethod.Button.HTMLButton;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
