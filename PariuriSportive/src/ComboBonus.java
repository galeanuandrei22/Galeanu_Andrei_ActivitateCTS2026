public class ComboBonus extends BonusDecorator {
    public ComboBonus(Bet bet) {
        super(bet);
    }

    public double getPayout() {
        return decoratedBet.getPayout() * 1.15;
    }

    public String getSummary() {
        return decoratedBet.getSummary() + " adaugat bonus combo de 15%";
    }
}
