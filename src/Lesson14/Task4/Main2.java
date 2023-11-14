package Lesson14.Task4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You want to start the game: ");
        String answer  = scanner.nextLine();
        while (answer.equalsIgnoreCase("Yes")){
            int score=0;
            ShapeChallenge shapeChallenge = new ShapeChallenge();
            System.out.println("Please choose the shape: ");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("circle")){
                System.out.println("Enter the radius:");
                double radius  = scanner.nextDouble();
                double result = shapeChallenge.calculateArea(choice,radius);
                System.out.println("Please enter your guess: ");
                double guess = scanner.nextDouble();
                if(guess ==result){
                    System.out.println("Congrats");
                    score+=5;
                } else{
                    System.out.println("Wrong answer");
                }
            } else if (choice.equalsIgnoreCase("rectangle")) {
                System.out.println("Width: ");
                int width = scanner.nextInt();
                System.out.println("Length: ");
                int length = scanner.nextInt();
                double result = shapeChallenge.calculateArea(choice,width,length);
                System.out.println("Please enter your guess: ");
                double guess = scanner.nextDouble();
                if(guess ==result){
                    System.out.println("Congrats");
                    score+=10;
                } else{
                    System.out.println("Wrong answer");
                }
            } else if (choice.equalsIgnoreCase("triangle")) {
                System.out.println("base: ");
                int base = scanner.nextInt();
                System.out.println("height: ");
                int height = scanner.nextInt();
                double result = shapeChallenge.calculateArea(choice,base,height);
                System.out.println("Please enter your guess: ");
                double guess = scanner.nextDouble();
                if(guess ==result){
                    System.out.println("Congrats");
                    score+=15;
                } else{
                    System.out.println("Wrong answer");
                }

            } else{
                System.out.println("Invalid input");
            }
            System.out.println("Your score:  "+score);
        }
    }

}
