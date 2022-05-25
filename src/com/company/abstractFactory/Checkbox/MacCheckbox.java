package com.company.abstractFactory.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Отрисовать checkbox в стиле Mac");
    }
}
