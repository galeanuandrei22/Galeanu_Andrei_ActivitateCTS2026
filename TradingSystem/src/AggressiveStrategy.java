public class AggressiveStrategy implements TradingStrategy {
    @Override
    public void executeTrade(String stock, double price) {
        System.out.println("cumpara " + stock + " cu toti banii la pretul de " + price);
    }
}
