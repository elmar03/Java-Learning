package Repetition.StaticKeyWord;

public class Car {

    String name;
    static int numberOfCars;

    public Car(String name) {
        this.name = name;
        numberOfCars++;
    }

    static void displayCars(){
        System.out.println("You have "+numberOfCars+" cars.");
    }
}
