public class PlaceBetCommand implements Command {
    private Bet bet;
    private String userId;

    public PlaceBetCommand(String userId, Bet bet) {
        this.bet = bet;
        this.userId = userId;
    }

    public void execute() {
        System.out.println("Pariu plasat pentru: " + userId);
        System.out.println("Detaliile pariului: " + bet.getSummary());
        System.out.println("Castig potential: " + bet.getPayout());
    }

    public void undo() {
        System.out.println("Pariu anulat pentru: " + userId);
    }
}
