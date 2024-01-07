package MentorLesson27.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> library= new ArrayList<>((Collection)
                new Book("978-1-234567-89-0","Whispers of the Wind", "Emily A. Reynolds",9)
        );

    }
}
