package MentorLesson26.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        List<Book> books = Arrays.asList(
                new Book("The Stranger","Albert Camus",1942),
                new Book("The Trial","Franz Kafka",1925),
                new Book("The Tartar Steppe","Dino Buzzati",1940),
                new Book("Gone with the Wind","Margaret Mitchell",1936),
                new Book("The Fight Club","Chuck Palahniuk",1996),
                new Book("The Hannibal","Thomas Harris",1999),
                new Book("The Nickel Boys","Colson Whitehead",2019));
                new Book("Cloud Atlas","David Mitchell",2004);

                Optional<Book> latestBook = books.stream().max(Comparator.comparingInt(Book::getYear));

                if(latestBook.isPresent()){
                    System.out.println("Latest book is "+ latestBook);
                } else {
                    System.out.println("No books found");
                }
    }
}
