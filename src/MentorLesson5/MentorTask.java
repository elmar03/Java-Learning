package MentorLesson5;

import java.util.Scanner;

public class MentorTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st value: ");
        int input1 = scanner.nextInt();
        System.out.println("Please enter the 2nd value: ");
        int input2 = scanner.nextInt();
        System.out.println("Please enter the 3rd value: ");
        int input3 = scanner.nextInt();
        System.out.println("Please enter the 4th value: ");
        int input4 = scanner.nextInt();
        int [] array1 = {input1,input2,input3,input4,};
        int min = array1[0];
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if(array1[i]>max){
                max = array1[i];
            }
            if(array1[i]<min){
                min= array1[i];
            }

        }
        System.out.println("Maximum number is "+ max);
        System.out.println("Minimum number is "+ min);
    }
}
