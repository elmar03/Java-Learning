package MentorLesson25.Task1;

import java.util.Random;

public class MoviesList {

    private String []movies;
    public MoviesList(String... movies) {
        this.movies = movies;
    }

    public String getRandomMovie() {
        if (movies.length == 0) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(movies.length);
        return movies[randomIndex];
    }

}
