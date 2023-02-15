import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        Arrays.fill(people, new Person("Emi"));

        people = addPerson(people, new Person("Lou"));
        System.out.println(Arrays.toString(people));


        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static Person[] addPerson(Person[] people , Person newPerp){
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);

        newPeople[people.length - 1] = newPerp;
        return newPeople;
    }
}
