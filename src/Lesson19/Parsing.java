package Lesson19;

import java.util.Scanner;
public class Parsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Please enter the the expression: ");
        String expression = scanner.nextLine();
        char [] array = expression.toCharArray();
        char [] array1 = {'1','2','3','4','5','6','7','8','9',};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array[i]==array1[j]){

                }
            }

        }


        int parsedExpression = Integer.parseInt(expression);
        System.out.println(parsedExpression);


    }
}