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
                // call function to view all movies
                break;
        }
    }

}
