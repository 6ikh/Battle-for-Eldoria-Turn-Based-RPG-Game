import java.util.Random;

public class AggressiveStrategy implements Strategy {
    private final Random random = new Random();

    @Override
    public void execute(Player player, Enemy enemy) {
        int damage = random.nextInt(5) + 2; // More aggressive attack
        player.reduceHealth(damage);
        System.out.println("The Goblin strikes aggressively for " + damage + " damage!");
    }
}


