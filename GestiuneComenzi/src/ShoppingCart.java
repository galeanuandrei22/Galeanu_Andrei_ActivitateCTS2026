public class ShoppingCart {
    private double totalAmount;

    public void setTotalAmount(double amount) {
        this.totalAmount = amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public CartMemento saveState() {
        System.out.println("salvare cos cumparaturi. total curent: " + totalAmount);
        return new CartMemento(totalAmount);
    }

    public void restoreState(CartMemento memento) {
        this.totalAmount = memento.getSavedAmount();
        System.out.println("coul a fost restaurat la valoarea: " + totalAmount);
    }
}
