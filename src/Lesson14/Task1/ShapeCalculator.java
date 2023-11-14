package Lesson14.Task1;

public class ShapeCalculator {


    public void calculateArea(int length,int width){
        System.out.println("The area of rectangle: "+length*width*0.5);
    }

    public void calculateArea(double radius){
        System.out.println("The area of rectangle: "+Math.PI*Math.pow(radius,2));
    }

    public void calculateArea(double base, double height){
        System.out.println("The area of triangle: "+base*height*0.5);
    }
}
