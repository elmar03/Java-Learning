package Lesson14.Task4;

import java.util.Scanner;

public class ShapeChallenge {



    public double calculateArea(String shape,double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateArea(String shape,int width, int length) {
        return (width * length )* 0.5;

    }

    public double calculateArea(String shape,double base, double height) {
        return base * height * 0.5;

    }
    }