package com.company.composite.components;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    public List<Graphic> graphicList = new ArrayList<>();

    public void add(Graphic child) {
        graphicList.add(child);
    }

    public void remove(Graphic child) {
        graphicList.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : graphicList) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic child : graphicList) {
            child.draw();
        }
    }
}
