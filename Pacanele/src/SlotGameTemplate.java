public abstract class SlotGameTemplate {
    public final void play() {
        generateSymbols();
        calculateWinnings();
        triggerAnimations();
        updateBalance();
    }

    protected abstract void generateSymbols();
    protected abstract void calculateWinnings();

    private void triggerAnimations() {
        System.out.println("Efecte vizuale (puff)");
    }

    private void updateBalance() {
        System.out.println("Balanta a fost actualizata!");
    }
}
