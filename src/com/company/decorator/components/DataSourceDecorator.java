package com.company.decorator.components;

public class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData() {
        wrappee.writeData();
    }

    @Override
    public void readDate() {
        wrappee.readDate();
    }
}
