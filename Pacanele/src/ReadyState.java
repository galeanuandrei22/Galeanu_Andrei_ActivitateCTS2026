public class ReadyState implements SlotMachineState {
    private SlotContext machine;

    public ReadyState(SlotContext machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Ai introdus bani in aparat.");
    }

    @Override
    public void pressSpin() {
        System.out.println("Se invarte aparatul, rolele de pe ecran mai exact.");
        machine.setState(machine.getSpinningState());
    }

    @Override
    public void collectWinnings() {
        System.out.println("Te-ai racorit! Nu ai nimic de colectat!");
    }
}
