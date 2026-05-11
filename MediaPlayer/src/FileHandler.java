public abstract class FileHandler {
    protected FileHandler nextHandler;

    public void setNext(FileHandler next) {
        this.nextHandler = next;
    }

    public abstract void handleRequest(String fileName);
}
