import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Adding 6 and 5: " + addition(6, 5));
        System.out.println("Subtracting 6 and 5: " + subtraction(6, 5));
        System.out.println("Multiplication 6 and 5: " + multiplication(6, 5));
        System.out.println("Division of 12 and 4: " + division(12, 4));
        System.out.println();

        System.out.println(checkInteger(1, 10));
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static String checkInteger(int min, int max) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int userNum = userInput.nextInt();
        if (userNum > min && userNum < max) {
            return "Congrats! You're guess is in range.";
        } else {
            return checkInteger(1, 10);
        }
    }
}
