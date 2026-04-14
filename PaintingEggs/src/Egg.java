public class Egg implements EggComponent {
    private EggPaintingStrategy strategy;

    public Egg(EggPaintingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String decorate() {
        return strategy.paint();
    }
}
