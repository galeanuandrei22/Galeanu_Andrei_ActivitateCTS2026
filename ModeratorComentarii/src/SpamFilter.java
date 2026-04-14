public class SpamFilter extends CommentHandler {
    @Override
    public void handle(String comment) {
        if(comment.contains("RECLAMA")) {
            System.out.println("Comentariu respins: s-a detectat spam!");
            return;
        }

        if(next != null) {
            next.handle(comment);
        }
    }
}
