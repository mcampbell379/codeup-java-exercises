import movies.Movie;
import movies.MoviesArray;
import util.Input;

public class MoviesApplication {

    private static Movie[] movies;

    public static void main(String[] args) {
        movies = MoviesArray.findAll();

        Input input = new Input();

        // command loop
        // each iteration:
        // 1. print the menu
        // 2. wait for the user to enter a choice
        // 3. do whatever the choice is
        // until the user enters choice 0
        while(true) {
            // 1. print the menu
            printMenu();

            // 2. wait for the user to enter a choice
            int choice = input.getInt("Enter your choice: ");

            // 3. do whatever the choice is
            doChoice(choice);

            // until the user enters choice 0
            if(choice == 0) {
                break;
            }
        }

        System.out.println("Bye");

    }

    private static void printMenu() {
        System.out.println("""
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                """);
    }

    private static void doChoice(int choice) {
        switch(choice) {
            case 1:
                printAllMovies();
                break;
            case 2:
                printMoviesByCategory("animated");
                break;
            case 3:
                printMoviesByCategory("drama");
                break;
            case 4:
                printMoviesByCategory("horror");
                break;
            case 5:
                printMoviesByCategory("scifi");
                break;
        }
    }

    private static void printMoviesByCategory(String category) {
        for (Movie movie : movies) {
            if(movie.getCategory().equals(category)){
                System.out.println(movie);
            }
        }
        System.out.println();
    }

    private static void printAllMovies() {
        // print all movies to console using a toString method in Movie.java
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();
    }



}
