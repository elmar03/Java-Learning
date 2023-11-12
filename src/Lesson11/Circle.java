package Lesson11;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double pi = Math.PI;
        return pi*Math.pow(radius,2);

    }
    public double CalculateDiameter(){
        return radius*2;
    }

    public double CalculatePerimeter(){
        return radius*Math.PI*2;
    }

    public void DisplayResults(){
        System.out.println("The Area of circle: " + calculateArea());
        System.out.println("The Diameter of circle: " + CalculateDiameter());
        System.out.println("The Perimeter of circle: " + CalculatePerimeter());
    }
}
