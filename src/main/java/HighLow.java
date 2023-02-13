import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        guessingGame();
    }

    public static int randomNum(int max) {
        return (int) Math.floor(Math.random() * max + 1);
    }

    public static void guessingGame() {
        int guessAnswer = randomNum(100);
        int userGuess;
        Scanner userInput = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number between 1 and 100: ");
            userGuess = userInput.nextInt();
            if (userGuess == guessAnswer) {
                System.out.println("GOOD GUESS!");
                System.out.println("ANSWER: " + guessAnswer);
                break;
            } else if (guessAnswer > userGuess) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
        }

        userInput.close();
    }
}
