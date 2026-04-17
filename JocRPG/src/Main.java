public class Main {
    public static void main(String[] args) {
        GameEngine engine = GameEngine.getInstance();

        Enemy finalBoss = EnemyFactory.createEnemy("dragon");
        finalBoss.spawn();

        AttackStrategy attack = new MagicAttack();
        attack.executeAttack();

        engine.addScore(50);
        engine.showStatus();
    }
}
