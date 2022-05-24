package com.company.factoryMethod.Dialog;

import com.company.factoryMethod.Button.Button;
import com.company.factoryMethod.Button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
