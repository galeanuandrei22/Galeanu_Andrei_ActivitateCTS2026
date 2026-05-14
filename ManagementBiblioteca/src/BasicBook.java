public class BasicBook implements Book {
    private String title;

    public BasicBook(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return title;
    }

    @Override
    public double getPrice() {
        return 25.5;
    }
}
