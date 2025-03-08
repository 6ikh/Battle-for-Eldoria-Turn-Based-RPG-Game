import java.util.Random;

public class Player {
    private int health;

    public Player() {
        this.health = 20;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int healAmount) {
        Random random = new Random();
        int heal = random.nextInt(3) + 1;
        health += heal;
    }

    public void reduceHealth
    (int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }
}