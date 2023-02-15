package playtime;

public class Arena {

    public static void main(String[] args) {
        Fighter bob = new Fighter("Bob");
        Ninja kai = new Ninja("Sue");

        Fighter weirdo = new Ninja("Weirdo");

        Fighter[] combatants = new Fighter[5];
        combatants[0] = weirdo;
        combatants[1] = bob;

        System.out.println("-------------------------------------");
        for (Fighter combatant : combatants) {
            if(combatant != null){
//                if(combatant instanceof Ninja) {
//                    System.out.println("WE GOT A NINJA");
//                    ((Ninja) combatant).throwShuriken(combatants[1]);
//                } else {
//                    System.out.println("Just a plain fighter");
//                }
                System.out.println(combatant);
            }
        }

        // TODO: hand out the weapons
        Weapon club = new Weapon("Club", 5);
        Weapon shuriken = new Weapon("Shuriken", 2);
        bob.setCurrentWeapon(club);
        kai.setCurrentWeapon(shuriken);

        // TODO: DO FIGHTING HERE
        // display initial health
        System.out.println("Bobs health is: " + bob.getHealth());
        System.out.println("Sues health is: " + kai.getHealth());

        bob.taunt();
        kai.taunt();

        kai.throwShuriken(bob);
        kai.jump();

        System.out.println();
        System.out.println("Bobs health is: " + bob.getHealth());
        System.out.println("Sues health is: " + kai.getHealth());

    }
}
