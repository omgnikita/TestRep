package com.company.decorator;

import com.company.decorator.components.CompressionDecorator;
import com.company.decorator.components.DataSource;
import com.company.decorator.components.EncryptionDecorator;
import com.company.decorator.components.FileDateSource;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new FileDateSource("hello.txt");
        dataSource.writeData();

        dataSource = new CompressionDecorator(dataSource);
        dataSource.writeData();

        dataSource = new EncryptionDecorator(dataSource);
        dataSource.writeData();

        dataSource = new CompressionDecorator(dataSource);
        dataSource.writeData();
    }
}
