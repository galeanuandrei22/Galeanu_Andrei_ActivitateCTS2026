public class HighVolatilityStrategy implements PayoutStrategy {
    public double calculateMultiplier() {
        return Math.random() > 0.9 ? 50.00 : 0.0;
    }
}
