package com.company.flyweight;

public class TreeType {
    private String name;

    private String color;

    private String texture;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Рисую canvas на " + x +", " + y);
    }
}
