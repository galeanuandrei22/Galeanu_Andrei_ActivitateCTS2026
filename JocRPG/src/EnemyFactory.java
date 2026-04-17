public class EnemyFactory {
    public static Enemy createEnemy(String type) {
        if(type.equalsIgnoreCase("goblin")) return new Goblin();
        if(type.equalsIgnoreCase("dragon")) return new Dragon();
        return null;
    }
}
