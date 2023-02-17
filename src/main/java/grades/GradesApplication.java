package grades;

import util.Input;
import java.util.*;

public class GradesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();
        HashMap<String, Object> students = new HashMap<>();

        Student emi = new Student("Emi");
        emi.addGrade(97);
        emi.addGrade(84);
        emi.addGrade(63);
        Student andrea = new Student("Andrea");
        andrea.addGrade(57);
        andrea.addGrade(94);
        andrea.addGrade(82);
        Student micah = new Student("Micah");
        micah.addGrade(97);
        micah.addGrade(84);
        micah.addGrade(74);
        Student matt = new Student("Matt");
        matt.addGrade(97);
        matt.addGrade(84);
        matt.addGrade(62);

        students.put("garlicpowder", emi);
        students.put("paprika", micah);
        students.put("rosemary", andrea);
        students.put("thyme", matt);

        Set<String> keys = students.keySet();


        // CLI
        System.out.println("""
                Welcome!
                
                Here are the Github usernames of our students: 
                """);
        String githubUsernames = String.join(" | ", keys);
        System.out.print(githubUsernames);

        boolean exitChoice;

        do{

            String usernameSearch = userInput.getString("\n\nWhat student would you like to get Information on? ");

            if(!students.containsKey(usernameSearch)) {
                System.out.println("Sorry, no student found with the GitHub username of \"" + usernameSearch + "\"");
            } else {
                System.out.println("\n"+students.get(usernameSearch).toString());
            }

            exitChoice = userInput.yesNo("Would you like to see another student?");
        }while(exitChoice);

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
