public abstract class LoanHandler {
    protected LoanHandler next;
    public void setNext(LoanHandler next) {
        this.next = next;
    }
    public abstract boolean handle (String user, String book);
}
