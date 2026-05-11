public class ReadyToServeState implements OrderState {

    @Override
    public void next(Order context) {
        System.out.println("comanda finalizata si platita..");
    }

    @Override
    public void printStatus() {
        System.out.println("comanda gata de servit");
    }
}
