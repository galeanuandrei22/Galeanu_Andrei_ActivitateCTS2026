public class NewOrderState implements OrderState {

    @Override
    public void next(Order context) {
        context.setState(new InPreparationState());
    }

    @Override
    public void printStatus() {
        System.out.println("comanda preluata!");
    }
}
