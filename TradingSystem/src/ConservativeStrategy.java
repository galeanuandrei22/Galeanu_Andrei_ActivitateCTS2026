public class ConservativeStrategy implements TradingStrategy {
    @Override
    public void executeTrade(String stock, double price) {
        System.out.println("cumpara doar o unitate din " + stock);
    }
}
