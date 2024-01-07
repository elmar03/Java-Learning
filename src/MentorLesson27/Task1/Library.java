package MentorLesson27.Task1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> library = new ArrayList<>();

    public void addBook(Book book){
        library.add(book);
        System.out.println(book+ " is added to library");
    }
    public void removeBook(String isbn){
        library.removeIf(book -> Boolean.parseBoolean(book.getIsbn()));
    }

    public void getBook(String isbn){

    }
    public void printInventory(){

        for (Book item:library
             ) {
            System.out.println(item);
        }
    }
}
