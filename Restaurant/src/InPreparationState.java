public class InPreparationState implements OrderState {

    @Override
    public void next(Order context) {
        context.setState(new ReadyToServeState());
    }

    @Override
    public void printStatus() {
        System.out.println("se pregateste comanda..");
    }
}
