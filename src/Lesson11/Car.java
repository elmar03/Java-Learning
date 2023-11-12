package Lesson11;

import java.util.Arrays;

public class Car {
    String make;
    String country;
    Model model[];

    public Car(String make, String country, Model[] model) {
        this.make = make;
        this.country = country;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", country='" + country + '\'' +
                ", model=" + Arrays.toString(model) +
                '}';
    }
}
