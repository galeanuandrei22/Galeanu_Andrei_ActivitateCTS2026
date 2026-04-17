public class SpinningState implements SlotMachineState {
    private SlotContext machine;

    public SpinningState(SlotContext machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Momentan rolele se invart!");
    }

    @Override
    public void pressSpin() {
        System.out.println("Rolele deja se invart!");
    }

    @Override
    public void collectWinnings() {
        System.out.println("Nu poti colecta in timp ce rolele se invart!");
    }
}
