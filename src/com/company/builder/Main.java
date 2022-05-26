package com.company.builder;

import com.company.builder.builderClasses.CarBuilder;
import com.company.builder.builderClasses.CarManualBuilder;
import com.company.builder.classProduct.Car;
import com.company.builder.classProduct.ManualCar;
import com.company.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);
        ManualCar manualCar = carManualBuilder.getResult();

        System.out.println(car);
        System.out.println(manualCar);
    }
}
