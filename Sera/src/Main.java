public class Main {
    public static void main(String[] args) {
        PlantProfile orhidee = new PlantProfile.Builder("orhidee")
                .setHumidity(60)
                .withFertilizer()
                .build();
        System.out.println("se configureaza sera pentru " + orhidee);

        GreenHouseController controller = new GreenHouseController();
        IrrigationSystem irigare = new IrrigationSystem();
        controller.addListener(irigare);

        controller.updateSensors("humidity", 35);

        System.out.println("\n!!! proces de irigare !!!");
        WaterSprinkler simplu = new BasicSprinkler();
        WaterSprinkler imbogatitNutrienti = new NutrientDecorator(simplu);

        imbogatitNutrienti.spray();
    }
}