public class Order {
    private OrderState state = new NewOrderState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextStep() {
        state.next(this);
    }

    public void showStatus() {
        state.printStatus();
    }
}
