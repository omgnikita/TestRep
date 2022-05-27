package com.company.prototype;

public class Rectangle extends Shape {
    protected int width;

    protected int height;

    public Rectangle(){}
    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", X=" + X +
                ", Y=" + Y +
                ", color='" + color + '\'' +
                '}';
    }
}
