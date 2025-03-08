import java.util.Scanner;

public class PlayerTurn {
    private final Player player;
    private final Enemy enemy;
    private final Scanner scanner;

    public PlayerTurn(Player player, Enemy enemy, Scanner scanner) {
        this.player = player;
        this.enemy = enemy;
        this.scanner = scanner;
    }

    public void execute() {
        System.out.println("\nYour Turn:");
        System.out.println("Choose an action: (1) Attack (2) Defend (3) Heal");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Action action = new AttackAction();
            action.execute(player, enemy);
        } else if (choice == 2) {
            Action action = new DefendAction();
            action.execute(player, enemy);
        } else if (choice == 3) {
            Action action = new HealAction();
            action.execute(player, enemy);
        } else {
            System.out.println("Invalid choice. Try again.");
        }
    }
}