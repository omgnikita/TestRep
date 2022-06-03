package com.company.flyweight;

import java.util.List;

public class TreeFactory {
    private static List<TreeType> treeTypes;

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType type = treeTypes.stream()
                .filter(t -> t.getColor().equals(color) &&
                        t.getName().equals(name) &&
                        t.getTexture().equals(texture)).findFirst().orElse(null);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.add(type);
        }
        return type;
    }
}
