import java.util.Scanner;
public class Game {
    private final Player player;
    private final Enemy enemy;
    private final Scanner scanner;
    private final PlayerTurn playerTurn;

    public Game() {
        this.player = new Player();
        Strategy enemyStrategy = StrategyFactory.createStrategy();
        this.enemy = new Enemy(20, enemyStrategy);
        this.scanner = new Scanner(System.in);
        this.playerTurn = new PlayerTurn(player, enemy, scanner);
    }

    public void start() {
        System.out.println("Welcome, traveler. You have wandered into the cursed lands of Eldoria.");
        System.out.println("Dark forces roam these lands, and you must fight to survive.");
        System.out.println("A shadowy figure emerges from the fog...");
        System.out.println("You are fighting a Goblin, a minion of the Dark Lord!");
        while (player.isAlive() && enemy.isAlive()) {
            playerTurn.execute();
            if (enemy.isAlive()) {
                enemyTurn();
            }
        }
        endGame();
    }
    
    private void enemyTurn() {
        enemy.performAction(player);
    }

    private void endGame() {
        if (!enemy.isAlive()) {
            System.out.println("With a final strike, you vanquish the Goblin!");
            System.out.println("The path ahead is uncertain, but you have survived... for now.");
        }
        else if (!player.isAlive()) {
            System.out.println("You have been defeated. Game Over.");
        }
        System.out.println("Game Over");
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
    
}
