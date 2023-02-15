package playtime;

public class Ninja extends Fighter {
    private int numShurikens;

    public Ninja(String name) {
        super(name);

        numShurikens = 1;
    }

    public void jump (){
        System.out.println(this.getName() + ",the ninja, jumps!");
    }

    public void throwShuriken(Fighter poorBastard){
        //checking if out of shurikens
        if(numShurikens == 0){
            System.out.println("The ninja feels dumb");
        }
        numShurikens--;
        System.out.println(this.getName() + " threw a shuriken for 5 damage!");

        // doing damage
        int currentHealth = poorBastard.getHealth();
        currentHealth -= (5 + strength);
        poorBastard.setHealth(currentHealth);
    }

    @Override
    public void taunt() {
        System.out.println("あなたのお母さん\n");
    }


}
