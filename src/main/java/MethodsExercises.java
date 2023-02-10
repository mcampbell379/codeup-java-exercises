import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Adding 6 and 5: " + addition(6, 5));
        System.out.println("Subtracting 6 and 5: " + subtraction(6, 5));
        System.out.println("Multiplication 6 and 5: " + multiplication(6, 5));
        System.out.println("Division of 12 and 4: " + division(12, 4));
        System.out.println("Remainder of 60 divided by 7: " + modulus(60, 7));
        System.out.println();

        System.out.println(getInteger(1, 10));
        System.out.println();

        System.out.print("Enter an integer from 1 to 10: ");
        int userNum = userInput.nextInt();
        System.out.println("Your factorial is: " + factorial(userNum));
        System.out.println();
        userInput.close();

        diceRoll();
        System.out.println();
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
//        return num1 * num2;

        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return result;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static String getInteger(int min, int max) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int userNum = userInput.nextInt();
        if (userNum >= min && userNum <= max) {
            return "Congrats! You're guess is in range.";
        } else {
            return getInteger(1, 10);
        }
    }

    public static int factorial(int num) {
        for(int i = num-1; i > 1; i--){
            num *= i;
        }
        return num;
    }

    public static int randomNum(int max) {
        return (int)Math.floor(Math.random() * max + 1);
    }

    public static void diceRoll() {
        Scanner userInput = new Scanner(System.in);
        boolean userExitChoice = false;

        System.out.print("Enter the number of sides for 2 dice: ");
        int diceSides = userInput.nextInt();
        userInput.nextLine();

        do {
            System.out.println("Press ENTER to roll the dice...");
            String response = userInput.nextLine();
            if(response.equals("")){
                System.out.println("Dice 1: " + randomNum(diceSides));
                System.out.println("Dice 2: " + randomNum(diceSides));

                System.out.print("\nWould you like to roll again? Yes/No: ");
                String exitChoice = userInput.nextLine();
                if(exitChoice.equalsIgnoreCase("yes")){
                    userExitChoice = true;
                } else if(exitChoice.equalsIgnoreCase("no")){
                    userExitChoice = false;
                }

            }
        }while(userExitChoice);
    }
}
