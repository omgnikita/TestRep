package com.company.builder.classProduct;

public class Car {
    private int seats;

    private int engine;

    private int GPS;

    public int getSeats() {
        return seats;
    }

    public int getEngine() {
        return engine;
    }

    public int getGPS() {
        return GPS;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setGPS(int GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", GPS=" + GPS +
                '}';
    }
}
