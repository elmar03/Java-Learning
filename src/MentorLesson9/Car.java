package MentorLesson9;

public class Car {
    int id;
    String make;
    String model;
    int price;
    int year;
    double engine;
    int odometer;

    public Car(int id, String make, String model, int price, int year, double engine, int odometer) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.engine = engine;
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        return "MentorLesson9.Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", engine=" + engine +
                ", odometer=" + odometer +
                '}';
    }
}
