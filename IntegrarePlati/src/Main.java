public class Main {
    public static void main(String[] args) {
        LegacyPaymentSystem legacy = new LegacyPaymentSystem();
        PaymentProcessor adapter = new PaymentAdapter(legacy);
        OnlineStore store = new OnlineStore(adapter);

        store.checkout(750);
    }
}
