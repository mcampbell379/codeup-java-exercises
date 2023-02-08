import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // using printf formatting
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        System.out.print("Enter an integer: ");
        int anInt = userInput.nextInt();
        System.out.println(anInt);

        System.out.print("Enter 3 words: ");
        String word1 = userInput.next();
        String word2 = userInput.next();
        String word3 = userInput.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);

        // get newline char out of buffer
        // big dumb
        userInput.nextLine();
        System.out.print("Enter a sentence: ");
        String sentence = userInput.nextLine();
        System.out.println(sentence);

        System.out.print("Enter the length of classroom: ");
        String classroomLength = userInput.nextLine();

        System.out.print("Enter the width of classroom: ");
        String classroomWidth = userInput.nextLine();

        int area = Integer.parseInt(classroomLength) * Integer.parseInt(classroomWidth);
        int perimeter = Integer.parseInt(classroomLength) * 2 + Integer.parseInt(classroomWidth) * 2;

        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);

        userInput.close();


    }
}