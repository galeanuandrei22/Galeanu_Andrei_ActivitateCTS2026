public class CartMemento {
    private final double totalAmount;

    public CartMemento(double amount) {
        this.totalAmount = amount;
    }

    public double getSavedAmount() {
        return totalAmount;
    }
}
