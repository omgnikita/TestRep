package com.company.composite.components;

public class Dot implements Graphic {
    protected int x;

    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Нарисована точка в координате - " + x + ", " + y);
    }
}
