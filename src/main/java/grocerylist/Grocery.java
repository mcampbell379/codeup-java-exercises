package grocerylist;

public class Grocery {
    private String name;
    private String category;
    private int amount;

    public Grocery(String name, String category, int amount) {
        this.name = name;
        this.category = category;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }

    // accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
