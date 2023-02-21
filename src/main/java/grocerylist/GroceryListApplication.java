package grocerylist;

import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class GroceryListApplication {
    public static void main(String[] args) {
        Input userInput = new Input();
        ArrayList<String> categories = new ArrayList<>(Arrays.asList("Clothing", "Food And Drink", "Household", "Toiletries",   "Misc"));


        boolean newListChoice = userInput.yesNo("Would you like to create a new grocery list?");

        if (newListChoice) {
            HashMap<String, Grocery> groceries = new HashMap<>();
            boolean newItemChoice = userInput.yesNo("Would you like to add a new item? ");
            do {
                if (newItemChoice) {
                    String categoryChoice = userInput.getString("Choose the category to add the item to: ");
                    String nameChoice = userInput.getString("Enter the name of the item: ");
                    int amountChoice = userInput.getInt("Enter the how many of the item: ");

                    addGroceryItem(groceries, categoryChoice, nameChoice, amountChoice);
                }
                Set<String> keys = groceries.keySet();
                for (String key : keys) {
                    System.out.println(groceries.get(key));
                }
                userInput.getScanner().nextLine();
                boolean addAnother = userInput.yesNo("Would you like to add another item?");
                if (!addAnother) {
                    break;
                }
            }while (true);
            // show the list
            System.out.println(groceries);
        }
    }

    public static void addGroceryItem(HashMap<String, Grocery> list, String category, String name, int amount) {
        list.put(category, new Grocery(name, category, amount));
    }
}
