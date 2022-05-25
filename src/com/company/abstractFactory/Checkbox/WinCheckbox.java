package com.company.abstractFactory.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Отрисовать checkbox в стиле Windows");
    }
}
