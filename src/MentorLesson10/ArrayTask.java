package MentorLesson10;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [3];
        System.out.println("Please enter the array values: ");
        for (int i = 0; i < array.length; i++) {
            array [i] = scanner.nextInt();
        }
        System.out.println("The result for reversed array is: ");
        for (int i = (array.length-1); i>=0; i--) {
            System.out.print(array[i]+" ");

        }


    }
}
