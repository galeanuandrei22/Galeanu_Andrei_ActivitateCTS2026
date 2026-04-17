import java.util.ArrayList;
import java.util.List;

public class Match {
    private String name;
    private double odds;
    private List<Observer> bettors = new ArrayList<>();

    public Match(String name, double initialOdds) {
        this.name = name;
        this.odds = initialOdds;
    }

    public void subscribe(Observer bettor) {
        bettors.add(bettor);
    }

    public void setOdds(double newOdds) {
        this.odds = newOdds;
        notifyBettors();
    }

    private void notifyBettors() {
        for (Observer b : bettors) {
            b.update(name, odds);
        }
    }
}
