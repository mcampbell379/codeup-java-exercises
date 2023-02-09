import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String greeting = "sup, names Bob. short for Bobertini (⌐▨_▨)";
        Scanner userInput = new Scanner(System.in);
        System.out.println(greeting);

        do {
            System.out.print("Response: ");
            String answer = userInput.nextLine();


            if(answer.endsWith("?")){
                System.out.println("Sure.");
            } else if (answer.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (answer.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (answer.equalsIgnoreCase("bye")) {
                break;
            } else System.out.println("Whatever.");

        } while (true);

        userInput.close();
    }
}
