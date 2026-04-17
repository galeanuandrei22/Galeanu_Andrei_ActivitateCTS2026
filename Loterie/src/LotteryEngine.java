import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LotteryEngine {
    private static LotteryEngine instance;
    private final List<Player> participants = new ArrayList<>();
    private DrawStrategy strategy;

    private LotteryEngine() {
        this.strategy = new StandardDraw();
    }

    public static synchronized LotteryEngine getInstance() {
        if(instance == null) instance = new LotteryEngine();
        return instance;
    }

    public void setStrategy(DrawStrategy strategy) {
        this.strategy = strategy;
    }

    public void registerPlayer(Player player) {
        participants.add(player);
        System.out.println("Jucator adaugat: " + player.getName());
    }

    public void runLottery(int count, int range) {
        System.out.println("\nSe incepe extragerea...");
        Set<Integer> winningNumbers = strategy.generateNumbers(count, range);
        System.out.println("Numere extrase: " + winningNumbers);
        notifyParticipants(winningNumbers);
    }

    private void notifyParticipants(Set<Integer> winningNumbers) {
        for(Player p : participants) {
            p.update(winningNumbers);
        }
    }
}
