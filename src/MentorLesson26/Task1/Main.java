package MentorLesson26.Task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MovieStream> movies = Arrays.asList(
                new MovieStream("City of God","Drama"),
                new MovieStream("Black Hawk Down","Action"),
                new MovieStream("Inception","Sci-fi"),
                new MovieStream("Revenant","Action"),
                new MovieStream("Bad guys","Comedy"),
                new MovieStream("Arrival","Sci-fi"));

        System.out.println(movies.stream().map(MovieStream::getGenre).distinct().sorted().toList());
    }
}
