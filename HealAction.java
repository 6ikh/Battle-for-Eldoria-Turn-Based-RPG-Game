import java.util.Random;

public class HealAction implements Action {
    private final int healAmount;

    public HealAction() {
        this.healAmount = new Random().nextInt(3) + 1;
    }

    @Override
    public void execute(Player player, Enemy enemy) {
        player.heal(healAmount);
        System.out.println("You heal yourself for " + healAmount + " HP.");
    }
}