import java.util.Random;

public class StrategyFactory {
    private static final Random random = new Random();

    public static Strategy createStrategy() {
        boolean isAggressive = random.nextBoolean();
        Strategy enemyStrategy = isAggressive ? new AggressiveStrategy() : new PatientStrategy();
        return enemyStrategy;
    }
}

