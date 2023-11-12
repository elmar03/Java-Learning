package MentorLesson9;

import MentorLesson9.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car_1[] = new Car[3];
        car_1 [0] = new Car(1,"BMW","X5",40000,2020,5.5,10000);
        car_1 [1] = new Car(2,"BMW","X7",50000,2021,6.5,20000);
        car_1 [2] = new Car(3,"BMW","M5",600000,2022,4.5,15000);
        Manufacture manufacture1 = new Manufacture(1,"BMW","Germany",car_1);
        System.out.println(manufacture1);
        Car car_2[] = new Car[2];
        car_2 [0] = new Car(1,"Toyota","Camry",35000,2020,2.5,10000);
        car_2 [1] = new Car(2,"Toyota","Corolla",25000,2019,2.5,15000);
        Manufacture manufacture2 = new Manufacture(2,"Toyota","Japan",car_2);
        System.out.println(manufacture2);




    }
}
