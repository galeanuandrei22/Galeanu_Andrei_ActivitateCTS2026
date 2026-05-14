public abstract class PowerHandler {
    protected PowerHandler next;
    public void setNext(PowerHandler next) {
        this.next = next;
    }
    public abstract void handleOverload(double excessKw);
}
