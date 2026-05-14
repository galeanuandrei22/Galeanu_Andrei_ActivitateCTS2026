public class PaymentProxy implements PaymentGateway {
    private RealPaymentGateway realGateway;
    private String encryptionKey;

    public PaymentProxy(String key) {
        this.encryptionKey = key;
    }

    @Override
    public void processPayment(double amount) {
        if("cheiesigura".equals(encryptionKey)) {
            if(realGateway == null) {
                realGateway = new RealPaymentGateway();
            }
            realGateway.processPayment(amount);
        } else {
            System.out.println("conexiunea nu este sigura! tranzactie blocata!");
        }
    }
}
