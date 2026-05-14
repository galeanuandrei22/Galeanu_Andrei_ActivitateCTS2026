public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setTotalAmount(225.50);

        CartMemento backup = cart.saveState();

        cart.setTotalAmount(-25.50);

        if(cart.getTotalAmount() <= 0) {
            cart.restoreState(backup);
        }

        PaymentGateway securePayment = new PaymentProxy("cheiesigura");
        securePayment.processPayment(cart.getTotalAmount());

        PaymentGateway unsafePayment = new PaymentProxy("cheienesigura");
        unsafePayment.processPayment(cart.getTotalAmount());
    }
}
