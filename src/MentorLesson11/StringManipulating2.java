package MentorLesson11;

import java.util.Scanner;

public class StringManipulating2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String quote = "With the great power, comes great responsibility";
        String quoteWithoutSpaces = quote.replaceAll("\\s","");
        System.out.println("Number of the characters in the quote is: " + quoteWithoutSpaces.length());
        System.out.println(quote.toUpperCase());
        System.out.println(quote.toLowerCase());
        String text3 = scanner.nextLine();
        boolean a = text3.startsWith("A");
        if(a){
            System.out.println("Text starts with A");
        } else{
            System.out.println("Text does not starts with A");
        }
        boolean b = text3.endsWith("Z");
        if(b){
            System.out.println("Ends with 'Z'");
        }else{
            System.out.println("Does not end with 'Z'");
        }
        System.out.println(text3.replaceAll("e","E"));
        System.out.println(text3.substring(5,10));
        System.out.println(text3.trim());
        String [] words = text3.split("\\s+ ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
    }
}
