public class Main {
    private TradingStrategy strategy;

    public void setStrategy(TradingStrategy strategy) {
        this.strategy = strategy;
    }

    public void performTrade(String stock, double price) {
        strategy.executeTrade(stock, price);
    }

    public static void main(String[] args) {
        Main platform = new Main();

        LegacyPriceProvider legacySystem = new LegacyPriceProvider();
        StockAdapter adapter = new StockAdapter(legacySystem);

        String currentStock = adapter.getSymbol();
        double currentPrice = adapter.getPrice();

        System.out.println("date preluate prin adaptor: " + currentStock + " " + currentPrice);

        System.out.println("\nprofil conservator:");
        platform.setStrategy(new ConservativeStrategy());
        platform.performTrade(currentStock, currentPrice);

        System.out.println("\nprofil setat automat pe agresiv:");
        platform.setStrategy(new AggressiveStrategy());
        platform.performTrade(currentStock, currentPrice);
    }
}
