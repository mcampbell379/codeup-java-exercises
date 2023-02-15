package playtime;

public class Arena {

    public static void main(String[] args) {
        Fighter bob = new Fighter("Bob");
        Ninja kai = new Ninja("Sue");

        // TODO: hand out the weapons
        Weapon club = new Weapon("Club", 5);
        Weapon shurikin = new Weapon("Shurikin", 2);
        bob.setCurrentWeapon(club);
        kai.setCurrentWeapon(shurikin);

        // TODO: DO FIGHTING HERE
        // display initial health
        System.out.println("Bobs health is: " + bob.getHealth());
        System.out.println("Sues health is: " + kai.getHealth());

        bob.taunt();
        kai.taunt();
        kai.hit(bob);
        kai.hit(bob);
        kai.hit(bob);
        kai.jump();

        System.out.println("Bobs health is: " + bob.getHealth());
        System.out.println("Sues health is: " + kai.getHealth());

    }
}
