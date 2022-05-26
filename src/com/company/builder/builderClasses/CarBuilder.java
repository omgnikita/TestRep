package com.company.builder.builderClasses;

import com.company.builder.classProduct.Car;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int n) {
        car.setSeats(n);
    }

    @Override
    public void setEngine(int n) {
        car.setEngine(n);
    }

    @Override
    public void setGPS(int n) {
        car.setGPS(n);
    }

    public Car getResult() {
        return car;
    }
}
