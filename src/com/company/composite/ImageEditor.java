package com.company.composite;

import com.company.composite.components.Circle;
import com.company.composite.components.CompoundGraphic;
import com.company.composite.components.Dot;

public class ImageEditor {
    public static void main(String[] args) {
//        all = load();
//
//        groupSelected(all);
//
//        all.draw();
        CompoundGraphic all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        all.add(new Dot(2, 6));

        CompoundGraphic group = new CompoundGraphic();
        group.add(new Dot(1,5));
        group.add(new Circle(5,2,10));

        all.add(group);

        all.draw();
    }

//    public static CompoundGraphic all;
//
//    public static void groupSelected(CompoundGraphic components) {
//        CompoundGraphic group = new CompoundGraphic();
//        group.add(components);
//        all.remove(components);
//        all.add(group);
//    }
//
//    public static CompoundGraphic load() {
//        CompoundGraphic compoundGraphic = new CompoundGraphic();
//        compoundGraphic.add(new Dot(1, 2));
//        compoundGraphic.add(new Circle(5, 3, 10));
//        compoundGraphic.add(new Dot(2, 6));
//        return compoundGraphic;
//    }
}
