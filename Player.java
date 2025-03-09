import java.util.Random;

public class Player {
    private int health;
    private boolean defending;

    public Player() {
        this.health = 20;
        this.defending = false;
    }

    public void takeDamage(int damage) {
        if (defending) {
            damage /= 2; // Reduce damage by half when defending
        }
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void setDefending(boolean defending) {
        this.defending = defending;
    }

    

    public void heal(int healAmount) {
        Random random = new Random();
        int heal = random.nextInt(3) + 1;
        health += heal;
    }

 

    public boolean isAlive() {
        return health > 0;
    }
}