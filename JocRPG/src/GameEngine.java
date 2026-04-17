public class GameEngine {
    private static GameEngine instance;
    private int score = 0;

    private GameEngine() {}

    public static GameEngine getInstance() {
        if(instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public void addScore(int points) {
        score += points;
    }

    public void showStatus() {
        System.out.println("Scorul tau curent: " + score);
    }
}
