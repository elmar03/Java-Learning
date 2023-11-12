package Lesson11;

public class CarMain {
    public static void main(String[] args) {
        Model model [] = new Model[3];
        model[0] = new Model("Charger",50000,3.5,"black");
        model[1] = new Model("Challenger",60000,4.5,"purple");
        model[2] = new Model("Durango",70000,4.5,"red");
        Car car = new Car("DODGE","USA",model);
        System.out.println(car);
    }

}
