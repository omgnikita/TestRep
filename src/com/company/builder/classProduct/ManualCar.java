package com.company.builder.classProduct;

public class ManualCar {
    private String seats;

    private String engine;

    private String GPS;

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "seats='" + seats + '\'' +
                ", engine='" + engine + '\'' +
                ", GPS='" + GPS + '\'' +
                '}';
    }
}
