package introtojava;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int i = 5;
        int itwos = 0;

//        Using while and do while loops
        System.out.println();
        while(i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        do {
            itwos += 2;
            System.out.printf("%n%3d", itwos);
        }while(itwos < 100);

//        Using for loops instead -----------------------------------
        System.out.println();
        for (int j = 0; j <= 15; j++) {
            System.out.print(j + " \n");
        }
        System.out.println();
        for (int j = 0; j <= 100; j+=2) {
            System.out.printf("%n%3d", j);
        }

//        FizzBuzz exercise -------------------------------------------
        System.out.println();
        for (int j = 1; j <= 100; j++) {
            if(j % 3 == 0 && j % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(j % 3 == 0) {
                System.out.println("Fizz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(j);
        }

//        Table of Powers ----------------------------------------------
        System.out.println();
        System.out.print("What number would you like to go up to? ");
        int count = 1;
        int userInt = userInput.nextInt();
        System.out.println("Here is your table!\n");

        System.out.println("""
                number | squared | cubed
                ------ | ------- | -----""");

        while(count <= userInt) {
            System.out.printf("%-6d | %-7d | %-6d%n", count, (int)Math.pow(count, 2), (int)Math.pow(count, 3));
            count++;
        }

//        Letter Grade Conversion
        System.out.println();
        System.out.print("Enter your grade: ");
        int gradeInt = userInput.nextInt();

        if(gradeInt <= 100 && gradeInt >= 88) {
            System.out.println("Your grade is an A.");
        } else if(gradeInt <= 87 && gradeInt >= 80) {
            System.out.println("Your grade is a B.");
        } else if(gradeInt <= 79 && gradeInt >= 67) {
            System.out.println("Your grade is a C.");
        } else if(gradeInt <= 66 && gradeInt >= 60) {
            System.out.println("Your grade is a D.");
        } else {
            System.out.println("Your grade is an F.");
        }
    }
}
