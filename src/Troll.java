import java.util.Random;

public class Troll {
    private String name;
    private int hitPoints;
    private int minAttack;
    private int maxAttack;
    private Random rand;

    public Troll(String name, int hitPoints, int minAttack, int maxAttack) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.rand = new Random();
    }

    public void attack(Troll opponent) {
        int damageDealt = rand.nextInt(maxAttack - minAttack + 1) + minAttack;
        opponent.takeDamage(damageDealt);
        System.out.println(name + " attacks " + opponent.name + " dealing " + damageDealt + " damage.");
    }
}
