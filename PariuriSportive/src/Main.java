public class Main {
    public static void main(String[] args) {
        // 1. Inițializăm meciul
        Match derby = new Match("Petrloul vs U Cluj", 2.25);
        Observer user1 = (match, odds) -> System.out.println("Cota pentru " + match + " a devenit: " + odds);
        derby.subscribe(user1);
        derby.setOdds(2.25);
        Bet biletSimplu = new BasicBet(100.0, 2.25);
        Bet biletCuBonus = new ComboBonus(biletSimplu);
        Command placeBet = new PlaceBetCommand("UserJucator", biletCuBonus);
        placeBet.execute();
        System.out.println("Utilizatorul a anulat biletul");
        placeBet.undo();
    }
}
