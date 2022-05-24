package com.company.factoryMethod.Dialog;

import com.company.factoryMethod.Button.Button;

public class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    Button createButton(){
        return null;
    }
}
