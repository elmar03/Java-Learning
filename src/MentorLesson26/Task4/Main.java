package MentorLesson26.Task4;

import MentorLesson26.Task3.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String filePath = "C:\\Users\\elmar.soltanov\\Desktop\\text.txt";

        List<Integer> numbers = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while(scanner.hasNextInt()){
                int number = scanner.nextInt();
                numbers.add(number);
            }
            scanner.close();
        }catch (FileNotFoundException fne){
            System.out.println("File not found" + filePath);
            fne.printStackTrace();
        }
        System.out.println("Numbers from file "+numbers);
    }

}
