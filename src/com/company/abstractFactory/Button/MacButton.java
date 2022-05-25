package com.company.abstractFactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Отрисовать кнопку в стиле Mac");
    }
}
