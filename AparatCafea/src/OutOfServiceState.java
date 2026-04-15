public class OutOfServiceState implements CoffeeState {
    @Override
    public void handle(CoffeeMachine machine) {
        System.out.println("Aparatul de cafea nu functioneaza!");
    }
}
