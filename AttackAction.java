import java.util.Random;

public class AttackAction implements Action {
    private final int damage;

    public AttackAction() {
        this.damage = new Random().nextInt(5) + 1;
    }

    @Override
    public void execute(Player player, Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("You slashed the " + "Goblin" + " for " + damage + " damage.");
    }
}