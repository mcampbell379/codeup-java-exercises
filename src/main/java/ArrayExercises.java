import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        Arrays.fill(people, new Person("Emi"));

        Person[] newPeople = addPerson(people, new Person("bobby"));


        for (int i = 0; i < newPeople.length; i++) {
            System.out.println(newPeople[i]);
        }
    }

    public static Person[] addPerson(Person[] people , Person perp){
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            Arrays.fill(newPeople, people[i]);
        }
        newPeople[people.length] = perp;
        return newPeople;
    }
}
