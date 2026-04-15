public class IdleState implements CoffeeState {
    @Override
    public void handle(CoffeeMachine machine) {
        System.out.println("Se prepara cafeaua...");
        machine.setState(new BrewingState());
    }
}
