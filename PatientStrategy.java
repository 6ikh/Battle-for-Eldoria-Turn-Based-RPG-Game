public class PatientStrategy implements Strategy {
    @Override
    public void execute(Player player,Enemy enemy) {
        System.out.println("Goblin waits patiently, preparing for the next move.");
    }
}