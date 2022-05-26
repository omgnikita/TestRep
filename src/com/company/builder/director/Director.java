package com.company.builder.director;

import com.company.builder.builderClasses.Builder;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(10);
        builder.setGPS(20);
    }
}
