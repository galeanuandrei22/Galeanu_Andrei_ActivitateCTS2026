import java.util.Set;

public class LotteryUser implements Player {
    private String name;
    private Ticket ticket;

    public LotteryUser(String name, Ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public void update(Set<Integer> winningNumbers) {
        long matches = ticket.getNumber().stream().filter(winningNumbers::contains).count();
        System.out.println("[" + name + "] are " + ticket + ". Numere gasite: " + matches);
        if(matches >= 4) {
            System.out.println("Felicitari " + name + "! Ai castigat premiul!");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
