import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        LotteryEngine engine = LotteryEngine.getInstance();
        LotteryUser user1 = new LotteryUser("Ionut", TicketFactory.createTicket("Ionut", new TreeSet<>(Set.of(5, 12, 23, 34, 45, 48))));
        LotteryUser user2 = new LotteryUser("Ionela", TicketFactory.createTicket("Ionela", new TreeSet<>(Set.of(1, 2, 3, 4, 5, 7))));
        engine.registerPlayer(user1);
        engine.registerPlayer(user2);
        engine.setStrategy(new StandardDraw());
        engine.runLottery(6, 49);
    }
}
