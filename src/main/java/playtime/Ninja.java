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

    @Override
    public void taunt() {
        System.out.println("あなたのお母さん\n");
    }
}
