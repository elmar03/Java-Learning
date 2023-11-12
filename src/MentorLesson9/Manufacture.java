package MentorLesson9;

import MentorLesson9.Car;

import java.util.Arrays;

public class Manufacture {
    int id;
    String name;
    String country;
    Car car_1[];

    public Manufacture(int id, String name, String country, Car[] car_1) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.car_1 = car_1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Car[] getCar_1() {
        return car_1;
    }

    public void setCar_1(Car[] car_1) {
        this.car_1 = car_1;
    }

    @Override
    public String toString() {
        return "MentorLesson9.Manufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", car_1=" + Arrays.toString(car_1) +
                '}';
    }
}
