package com.company.decorator.components;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData() {
        System.out.println("Сжатие данных");
        wrappee.writeData();
    }

    @Override
    public void readDate() {
        wrappee.readDate();
        System.out.println("Распаковка данных");
    }
}
