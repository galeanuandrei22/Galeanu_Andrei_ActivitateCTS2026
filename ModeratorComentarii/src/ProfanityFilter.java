public class ProfanityFilter extends CommentHandler {
    @Override
    public void handle(String comment) {
        if(comment.contains("cuvantobscen")) {
            System.out.println("Comentariu respins: contine limbaj obscen!");
            return;
        }
        if(next != null) {
            next.handle(comment);
        }
    }
}
