public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();
        Book myBook = new BasicBook("o carte");
        Book specialBook = new AutographDecorator(myBook);

        library.borrowBook("un_user", specialBook);

        Book anotherBook = new BasicBook("alta carte");
        library.borrowBook("alt_user", anotherBook);
    }
}
