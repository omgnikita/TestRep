package com.company.prototype;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes  = new Shape[4];
        Circle circle = new Circle();
        circle.X = 10;
        circle.Y = 20;
        circle.radius = 15;
        shapes[0] = circle;

        Circle anotherCircle = (Circle) circle.clone();
        shapes[1] = anotherCircle;

        Rectangle rectangle = new Rectangle();
        rectangle.X = 10;
        rectangle.Y = 100;
        rectangle.height = 500;
        rectangle.width = 500;
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();
        shapes[2] = rectangle;
        shapes[3] = anotherRectangle;
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
