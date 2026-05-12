public abstract class NetworkFilter {
    protected NetworkFilter next;

    public void setNext(NetworkFilter next) {
        this.next = next;
    }

    public abstract void filter(String packet);
}
