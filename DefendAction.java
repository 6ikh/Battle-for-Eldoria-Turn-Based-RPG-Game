public class DefendAction implements Action {
    @Override
    public void execute(Player player, Enemy enemy) {
        System.out.println("You raise your shield, bracing for impact.");
        player.setDefending(true);
    }
}