public class LibraryFacade {
    private LoanHandler chain;

    public LibraryFacade() {
        this.chain = new PenaltyCheckHandler();
        this.chain.setNext(new AvailabilityHandler());
    }

    public void borrowBook(String user, Book book) {
        if(chain.handle(user, book.getDescription())) {
            System.out.println("cartea " + book.getDescription() + " a fost imprumutata");
            System.out.println("valoare asigurata: " + book.getPrice());
        } else {
            System.out.println("imprumutul nu a putut fi procesat!");
        }
    }
}
