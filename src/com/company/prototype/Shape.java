package com.company.prototype;

public abstract class Shape {
    protected int X;

    protected int Y;

    protected String color;

    public Shape(){}

    public Shape(Shape source) {
        if (source != null) {
            this.X = source.X;
            this.Y = source.Y;
            this.color = source.color;
        }
    }
    public abstract Shape clone();

}
