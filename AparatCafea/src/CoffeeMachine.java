public class CoffeeMachine {
    private CoffeeState state;

    public CoffeeMachine() {
        state = new IdleState();
    }

    public void setState(CoffeeState state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
