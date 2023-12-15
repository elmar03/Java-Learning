package Lesson22.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <NewBook> books = new ArrayList<>();
        books.add(new NewBook("To Kill a Mockingbird","Harper Lee",45,1960));
        books.add(new NewBook("The Godfather","Mario Puzo",55,1969));
        books.add(new NewBook("Frankenstein","Mary Shelley.",47,1821));

        Collections.sort(books);

        for (NewBook value: books
             ) {
            System.out.println(value);
        }

        Collections.sort(books, new Comparator<NewBook>() {

            @Override
            public int compare(NewBook n1, NewBook n2){
                return n1.publicationYear.compareTo(n2.publicationYear);
            }
        });

        for (NewBook value: books
        ) {
            System.out.println(value);
        }
        

    }
}
