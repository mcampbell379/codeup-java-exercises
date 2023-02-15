public class Person {
    private String name;
    public static void main(String[] args) {
// testing name change
        System.out.println("Changing the name: ");
        Person person1 = new Person("squeezy");
        System.out.println(person1.getName());
        person1.setName("Bobertini");
        System.out.println(person1.getName());

// understanding references
        System.out.println("\nTesting object references:");
        Person person2 = new Person("Bobertini");
        System.out.println("person1.getName().equals(person2.getName()) ======== " + person1.getName().equals(person2.getName()));
        System.out.println("person1 == person2 ======== " + (person1 == person2));

// testing sayHello
        person2.sayHello();
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sayHello(){
        System.out.println("Hello from " + name + "!");
    }
}
