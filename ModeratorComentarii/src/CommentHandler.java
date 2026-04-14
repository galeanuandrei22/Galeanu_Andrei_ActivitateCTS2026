public abstract class CommentHandler {
    protected CommentHandler next;

    public void setNext(CommentHandler next) {
        this.next = next;
    }

    public abstract void handle(String comment);
}
