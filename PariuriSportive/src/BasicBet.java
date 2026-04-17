public class BasicBet implements Bet {
    private double stake;
    private double odds;

    public BasicBet(double stake, double odds) {
        this.stake = stake;
        this.odds = odds;
    }

    public double getPayout() {
        return stake * odds;
    }

    public String getSummary() {
        return "Pariu simplu (Cota: " + odds + ")";
    }
}
