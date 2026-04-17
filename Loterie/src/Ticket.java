import java.util.Set;

public class Ticket {
    private final String ticketId;
    private final Set<Integer> chosenNumbers;
    private final String ownerName;

    public Ticket(String ticketId, String ownerName, Set<Integer> chosenNumbers) {
        this.ticketId = ticketId;
        this.ownerName = ownerName;
        this.chosenNumbers = chosenNumbers;
    }

    public Set<Integer> getNumber() {
        return chosenNumbers;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Bilet[" + ticketId + "] (" + ownerName + "): " + chosenNumbers;
    }
}
