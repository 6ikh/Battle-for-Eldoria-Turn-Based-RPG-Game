public class Enemy {
    private int health;
    private final Strategy strategy;


    public Enemy(int health, Strategy strategy) {
        this.health = 20;
        this.strategy = strategy;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void performAction(Player player) {
        strategy.execute(player, this);
        
    }


    public boolean isAlive() {
        return health > 0;
    }


}
