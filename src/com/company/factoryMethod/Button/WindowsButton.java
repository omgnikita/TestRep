package com.company.factoryMethod.Button;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Windows");
    }

    @Override
    public void onClick() {
        System.out.println("Click Windows");
    }
}
