public class OnlineStore {
    private PaymentProcessor processor;

    public OnlineStore(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(int amount) {
        processor.pay(amount);
    }
}
