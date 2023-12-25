package Repetition.General;

import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {
        fileReader("Pictures.txt");

    }

    public static void fileReader(String file){
        try {
            FileReader fileReader = new FileReader(file);
        } catch (java.io.FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
