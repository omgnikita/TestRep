package com.company.decorator.components;

public class FileDateSource implements DataSource {
    public FileDateSource(String filename) {
    }

    @Override
    public void writeData() {
        System.out.println("Запись данных");
    }

    @Override
    public void readDate() {
        System.out.println("Чтение данных");
    }
}
