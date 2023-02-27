import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String userString = userInput.nextLine();
        System.out.println("You Entered: \"" + userString + "\"");

        // using stringutils to check if a number
        if (StringUtils.isNumeric(userString)) {
            System.out.println("\"" + userString + "\" is a number");
        } else {
            System.out.println("\"" + userString + "\" is not a number");
        }

        // using stringutils to flipcase
        System.out.println("Flipped Case: " + StringUtils.swapCase(userString));
        System.out.println("Reversed: " + StringUtils.reverse(userString));
    }
}
