package com.company.decorator.components;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData() {
        System.out.println("Шифрование данных");
        wrappee.writeData();
    }

    @Override
    public void readDate() {
        wrappee.readDate();
        System.out.println("Расшифровка данных");
    }
}
