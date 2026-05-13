class DragonHabitat implements HabitatModule {
    public void oxygenate() {
        System.out.println("spaceX: sistem de oxigenare Dragon activat..");
    }
}

class StarlinkLab implements ResearchModule {
    public void conductExperiment() {
        System.out.println("spaceX: experiment inceput..");
    }
}


public class SpaceXFactory implements ModuleFactory {
    public HabitatModule createHabitat() {
        return new DragonHabitat();
    }

    public ResearchModule createResearch() {
        return new StarlinkLab();
    }
}
