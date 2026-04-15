public class BrewingState implements CoffeeState {
    @Override
    public void handle(CoffeeMachine machine) {
        System.out.println("Cafeaua este in curs de preparare..");
        System.out.println("Cafeaua este gata!");
        machine.setState(new IdleState());
    }
}
