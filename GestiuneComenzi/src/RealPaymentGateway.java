public class RealPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("tranzactie procesata cu succes pt suma " + amount);
    }
}
