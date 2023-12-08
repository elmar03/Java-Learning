package MentorLesson21.Task2;

public class Vehicle {
    private VehicleType type;

    public Vehicle(VehicleType type1) {
        this.type=type1;
    }

    public void printInfo(){
        System.out.println("This is "+ type);
    }
}
