package MentorLesson11;

import java.util.Scanner;

public class StringManipulating3 {
    public static void main(String[] args) {
        System.out.println("Please enter the text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.length());
        boolean x = text.contains("apple");
        if(x){
            System.out.println("Contains apple");
        }else{
            System.out.println("Does not contain apple");
        }
        System.out.println(text.replaceAll("Aplle","Orange"));
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        String text2 =  scanner.nextLine();
        System.out.println(text2.substring(0,5));
        System.out.println(text2.substring(text2.length()-5,text2.length()));
        boolean y = text2.startsWith("Hello");
        if(y){
            System.out.println("Starts with 'Hello'");
        }else{
            System.out.println("Does not start with 'Hello'");
        }
        boolean z = text2.endsWith("World");
        if(z){
            System.out.println("Ends with 'world'");
        }else{
            System.out.println("Does not end with 'world'");
        }

    }


}
