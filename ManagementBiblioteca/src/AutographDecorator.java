public class AutographDecorator implements Book {
    private Book book;

    public AutographDecorator(Book book) {
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription() + " (este cu autograf)";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 20.5;
    }
}
