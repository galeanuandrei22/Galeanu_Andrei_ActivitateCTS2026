public class Main {
    public static void main(String[] args) {
        ModuleFactory tProvider = new SpaceXFactory();
        HabitatModule lQuarters = tProvider.createHabitat();
        ResearchModule bLab = tProvider.createResearch();

        lQuarters.oxygenate();
        bLab.conductExperiment();

        StationSector mStation = new StationSector("statie noua");
        StationSector sWing = new StationSector("aripa stiinta");

        sWing.addComponent(new PhysicalModule("laborator 1"));
        sWing.addComponent(new PhysicalModule("laborator 2"));

        mStation.addComponent(sWing);
        mStation.addComponent(new PhysicalModule("dormitoare"));

        mStation.showStructure();

        LifeSupportContext lss = new LifeSupportContext();
        lss.printCurrentStatus();

        lss.triggerEvent();
        lss.printCurrentStatus();

        lss.triggerEvent();
    }
}
