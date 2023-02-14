package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

    }

    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        //TODO: get a string from the user in console
        return scanner.nextLine();
    }

    public boolean yesNo() {
        //TODO: asks the user yes or no and returns true if the user enters yes or variations of, false otherwise
        String userYesNo = scanner.next();
        return userYesNo.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userYesNo = scanner.next();
        return userYesNo.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        //TODO: asks the user for an int between min and max **recurssion**
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInt = scanner.nextInt();
        scanner.nextLine();
        if (userInt <= min || userInt >= max) {
            System.out.println("Try again.");
            getInt(min, max);
        }
        return userInt;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        //TODO: gets a double from the user as long as its in between the min an max **recurssion**
        System.out.print("Enter a decimal number between " + min + " and " + max + ": ");
        double userDouble = scanner.nextDouble();
        scanner.nextLine();
        if (userDouble <= min || userDouble >= max) {
            System.out.println("Try again.");
            getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
