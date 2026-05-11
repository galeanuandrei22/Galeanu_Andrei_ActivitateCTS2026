public class NutrientDecorator implements WaterSprinkler {
    private WaterSprinkler basicSprinkler;

    public NutrientDecorator(WaterSprinkler sprinkler) {
        this.basicSprinkler = sprinkler;
    }

    @Override
    public void spray() {
        basicSprinkler.spray();
        System.out.println(" si se adauga nutrienti");
    }
}
