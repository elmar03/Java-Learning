package Repetition.StaticKeyWord;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW");
        Car car2 = new Car("Mercedes");
        Car car3 = new Car("Aston-Martin");
        Car car4 = new Car("Toyota");

        System.out.println(Car.numberOfCars);
        Car.displayCars();

    }
}
