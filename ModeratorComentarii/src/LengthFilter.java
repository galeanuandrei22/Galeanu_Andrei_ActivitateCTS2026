public class LengthFilter extends CommentHandler {
    @Override
    public void handle(String comment) {
        if(comment.length() > 75) {
            System.out.println("Comentariu sters: comentariu prea lung!");
            return;
        }
        System.out.println("Comentariu acceptat!");
    }
}
