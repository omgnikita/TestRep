package com.company.builder.builderClasses;

import com.company.builder.classProduct.ManualCar;

public class CarManualBuilder implements Builder {
    private ManualCar manualCar;

    @Override
    public void reset() {
        manualCar = new ManualCar();
    }

    @Override
    public void setSeats(int n) {
        manualCar.setSeats("Количество сидений - " + n);
    }

    @Override
    public void setEngine(int n) {
        manualCar.setEngine("ДВС - " + n);
    }

    @Override
    public void setGPS(int n) {
        manualCar.setGPS("GPS - " + n);
    }

    public ManualCar getResult() {
        return manualCar;
    }
}
