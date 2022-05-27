package com.company.prototype;

public class Circle extends Shape {
    protected int radius;

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Circle(){}

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", X=" + X +
                ", Y=" + Y +
                ", color='" + color + '\'' +
                '}';
    }
}
