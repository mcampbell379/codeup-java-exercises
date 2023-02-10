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
        int guessLimit = 5;
        int guessesMade = 0;
        int userGuess;
        Scanner userInput = new Scanner(System.in);

        for (int i = guessesMade; i < guessLimit;) {
            System.out.print("Enter a number between 1 and 100: ");
            userGuess = userInput.nextInt();
            if(guessesMade >= guessLimit){
                System.out.println("Sorry. You ran out of guesses.");
            } else if (userGuess == guessAnswer) {
                System.out.println("GOOD GUESS!");
                System.out.println("ANSWER: " + guessAnswer);
                break;
            } else if (guessAnswer > userGuess) {
                System.out.println("HIGHER");
                i++;
            } else {
                System.out.println("LOWER");
                i++;
            }
        }


        userInput.close();
    }
}
