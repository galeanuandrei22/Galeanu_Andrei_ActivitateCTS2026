public class AvailabilityHandler extends LoanHandler {

    @Override
    public boolean handle(String user, String book) {
        System.out.println("verificare stoc pentru cartea: " + book);
        return (next == null) || next.handle(user, book);
    }
}
