public class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentSystem legacySystem;

    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void pay(int amount) {
        legacySystem.makePayment(amount);
    }
}
