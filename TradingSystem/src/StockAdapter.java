public class StockAdapter {
    private LegacyPriceProvider legacyProvider;

    public StockAdapter(LegacyPriceProvider provider) {
        this.legacyProvider = provider;
    }

    public double getPrice() {
        String rawData = legacyProvider.getRawStockData();
        String[] parts = rawData.split(",");
        return Double.parseDouble(parts[1]);
    }

    public String getSymbol() {
        return legacyProvider.getRawStockData().split(",")[0];
    }
}
