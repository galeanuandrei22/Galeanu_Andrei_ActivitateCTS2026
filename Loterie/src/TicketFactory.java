import java.util.Set;

public class TicketFactory {
    private static int counter = 100;

    public static Ticket createTicket(String ownerName, Set<Integer> numbers) {
        return new Ticket("Loto" + (counter++), ownerName, numbers);
    }
}
