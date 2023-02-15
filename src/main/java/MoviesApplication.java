//public class MoviesApplication {
//
//    public static void main(String[] args) {
//        Input input = new Input();
//
//        // command loop
//        // each iteration:
//        // 1. print the menu
//        // 2. wait for the user to enter a choice
//        // 3. do whatever the choice is
//        // until the user enters choice 0
//        while(true) {
//            // 1. print the menu
//            printMenu();
//
//            // 2. wait for the user to enter a choice
//            int choice = input.getInt(0, 5, "Enter your choice: ");
//
//            // 3. do whatever the choice is
//            doChoice(choice);
//
//            // until the user enters choice 0
//            if(choice == 0) {
//                break;
//            }
//        }
//
//        System.out.println("Bye");
//
//    }
//
//    private static void printMenu() {
//        System.out.println("Menu goes here");
//    }
//
//    private static void doChoice(int choice) {
//        switch(choice) {
//            case 1:
//                // call function to view all movies
//                break;
//            // ...
//        }
//    }
//
//}

import movies.MoviesArray;
import movies.Movie;
import util.Input;


public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();

        Movie[] moviesArr = MoviesArray.findAll();

        System.out.println("What would you like to do?");
        for (int i = 0; i < moviesArr.length; i++) {
            System.out.println("""
                    0 - exit
                    1 - view all movies
                    2 - view movies in the animated category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the scifi category
                                        
                    Enter your choice: \s
                    """);

            int userChoice = userInput.getInt();
            if(userChoice == 0){
                break;
            } else if (userChoice == 1) {


            } else if (userChoice == 2) {
                viewMoviesByCategory(moviesArr, "animated", 0);
            } else if (userChoice == 3) {

            } else if (userChoice == 4) {

            } else if (userChoice == 5) {

            }
        }

    }

    // loop thru movies and if each movie is in category, print it
    public static void viewMoviesByCategory(Movie[] movies, String categorySearch, int i){
        if(movies[i].getCategory().equals(categorySearch)){
            System.out.println(movies[i].getName() + " " + movies[i].getCategory());
        }
    }
}
