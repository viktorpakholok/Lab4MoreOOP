package lotr;

import java.util.Random;

public class GameManager {
    private Random random = new Random();

    public void fight(Character c1, Character c2) { 
        int order = random.nextInt(1);
        System.out.println("Fight between Character 1: " + c1 + " and " + c2);
        if (c1.getPower() == 0 && c2.getPower() == 0) {
            System.out.println(c1 + " will fight with " + c2 + " forever");
            return;
        }
        int i = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(i + " round: \nCharacter 1: " + c1 + " and Character 2: " + c2);
            if (order == 0) {
                c1.kick(c2);
                c2.kick(c1);
            } else {
                c2.kick(c1);
                c1.kick(c2);
            }
            i += 1;
        }
        if (c1.isAlive()) {
            System.out.println("Character 1 (" + c1 + ") won on " + i + " round with " + c1.getHp() + " HP");
        } else {
            System.out.println("Character 2 (" + c2 + ") won on " + i + " round with " + c2.getHp() + " HP");
        }
    }
}
