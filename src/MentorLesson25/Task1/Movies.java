package MentorLesson25.Task1;

import java.util.*;

public class Movies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        HashMap <String, MoviesList> movieGenres= new HashMap<>();
        movieGenres.put("Action",new MoviesList("Seven Samurai","Mad max","Kill bill"));
        movieGenres.put("Science Fiction ",new MoviesList("Children Of Men","Predator ","12 Monkeys"));
        movieGenres.put("Comedy",new MoviesList("The Hangover","Friday","Dumb & Dumber"));
        movieGenres.put("Drama",new MoviesList("Oppenheimer","City of God","Whiplash"));
        movieGenres.put("Anime",new MoviesList("Ninja Scroll","Spirited Away","The Animatrix"));
        movieGenres.put("Documentary",new MoviesList("The War Game","Nanook of the North","Grizzly Man"));
        movieGenres.put("Thriller",new MoviesList("The Prestige","Seven","Black Swan"));

        System.out.println("Welcome");
        System.out.println("Please choose the genre of the movie from given options: ");
        System.out.println("__________");
        for (String key: movieGenres.keySet()) {
            System.out.println(key);
        }
        System.out.println(movieGenres.keySet());
        String selectedGenre = scanner.nextLine();

        MoviesList userMovies = movieGenres.get(selectedGenre);
        String randomMovie = userMovies.getRandomMovie();



        if (randomMovie != null) {
            System.out.println("We recommend: " + selectedGenre + ": " + randomMovie);
//      } else if {
//            System.out.println("No movies found for the selected genre.");
//        }
    } else {
        System.out.println("Invalid genre selected.");
    }

    }
}
