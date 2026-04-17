public abstract class BonusDecorator implements Bet {
    protected Bet decoratedBet;

    public BonusDecorator(Bet bet) {
        this.decoratedBet = bet;
    }
}
