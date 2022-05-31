package com.company.composite.components;

public class Circle extends Dot {
    protected int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисована окружность в координате - "
                + x + ", " + y + " и радиусом " + radius);
    }
}
