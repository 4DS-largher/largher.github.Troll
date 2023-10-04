public class TrollTest {
    public static void main(String[] args) {
        Troll troll1 = new Troll("Grug", 100, 10, 20);
        Troll troll2 = new Troll("Franco", 120, 8, 18);

        while (troll1.isAlive() && troll2.isAlive()) {
            troll1.attack(troll2);
            troll2.attack(troll1);

            System.out.println(troll1.getName() + " has " + troll1.getHitPoints() + " hit points.");
            System.out.println(troll2.getName() + " has " + troll2.getHitPoints() + " hit points.");
            System.out.println();
        }

        if (troll1.isAlive()) {
            System.out.println(troll1.getName() + " wins!");
        } else if (troll2.isAlive()) {
            System.out.println(troll2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
