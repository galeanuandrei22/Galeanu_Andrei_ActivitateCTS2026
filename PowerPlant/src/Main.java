public class Main {
    public static void main(String[] args) {
        MeterModel industrialModel = MeterFactory.getModel("model nou", "v2.2", 500);

        industrialModel.displayReport("456", 24.78);
        industrialModel.displayReport("789", 52.87);

        PowerHandler eco = new EcoModeHandler();
        PowerHandler emergency = new EmergencyHandler();
        eco.setNext(emergency);

        eco.handleOverload(50);
        eco.handleOverload(700);
    }
}
