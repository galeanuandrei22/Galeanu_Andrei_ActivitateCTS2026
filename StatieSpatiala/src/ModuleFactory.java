public interface ModuleFactory {
    HabitatModule createHabitat();
    ResearchModule createResearch();
}

interface HabitatModule {
    void oxygenate();
}

interface ResearchModule {
    void conductExperiment();
}
