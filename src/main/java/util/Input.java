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
    public String getString(String prompt) {
        System.out.println(prompt);
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
        String userYesNo = scanner.nextLine();
        return userYesNo.startsWith("y");
    }

    public int getInt(int min, int max) {
        //TODO: asks the user for an int between min and max **recursion**
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInt = 0;
        try {
            String s = getString();
            userInt = Integer.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number.");
            userInt = getInt();
        }
        return userInt;
    }

    public int getInt() {
        System.out.print("Enter a number: ");
        int userInt = 0;
        try {
            String s = getString();
            userInt = Integer.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number.");
            userInt = getInt();
        }
        return userInt;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int userInt = 0;
        try {
            String s = getString();
            userInt = Integer.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number.");
            userInt = getInt();
        }
        return userInt;
    }

    public double getDouble(double min, double max) {
        //TODO: gets a double from the user as long as its in between the min an max **recursion**
        System.out.print("Enter a decimal number between " + min + " and " + max + ": ");
        double userDouble = 0;
        try {
            String s = getString();
            userDouble = Double.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number.");
            userDouble = getDouble();
        }
        return userDouble;
    }

    public double getDouble() {
        double userDouble = 0;
        try {
            String s = getString();
            userDouble = Double.valueOf(s);
        } catch (NumberFormatException e){
            System.out.println("Please enter a valid number.");
            userDouble = getDouble();
        }
        return userDouble;
    }

    // accessors

    public Scanner getScanner() {
        return scanner;
    }
}
