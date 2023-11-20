package MentorLesson16.Task1;

public class Circle extends Shape {
    @Override
    public void draw() {

    }

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of the circle: "+Math.PI*Math.pow(radius,2));
    }
}
