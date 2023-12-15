package Lesson22.Task1;

import Lesson22.Task1.Book;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <Book> library = new ArrayList<>();
        library.add(new Book("World Order","Ray Dalio",60));
        library.add(new Book("Martin Iden","Jack London",40));
        library.add(new Book("The old man and Sea","Ernest Hemingway",75));
        Collections.sort(library);
        //Arrays.sort(library);

        for (Book book:library
             ) {
            System.out.println(book);
        }



    }
}
