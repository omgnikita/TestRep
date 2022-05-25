package com.company.abstractFactory.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Отрисовать кнопку в стиле Windows");
    }
}
