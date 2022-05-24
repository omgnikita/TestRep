package com.company.factoryMethod.Button;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Render HTML");
    }

    @Override
    public void onClick() {
        System.out.println("Click HTML");
    }
}
