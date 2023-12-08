package MentorLesson21.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(VehicleType.BICYCLE);
        Vehicle vehicle1 = new Vehicle(VehicleType.CAR);
        Vehicle vehicle2 = new Vehicle(VehicleType.MOTORCYCLE);
        Vehicle vehicle3 = new Vehicle(VehicleType.TRUCK);

        vehicle.printInfo();
        vehicle1.printInfo();
        vehicle2.printInfo();
        vehicle3.printInfo();

}}
