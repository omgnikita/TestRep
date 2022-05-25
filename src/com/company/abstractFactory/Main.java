package com.company.abstractFactory;

import com.company.abstractFactory.Factory.GUIFactory;
import com.company.abstractFactory.Factory.MacFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();
        factory.createButton().paint();
        factory.createCheckbox().paint();
    }
}
