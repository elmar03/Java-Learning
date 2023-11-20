package MentorLesson16.Task1;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {

    }

    @Override
    void calculateArea() {
        System.out.println("Area of the rectangle: "+width*length*0.5);
    }
}
