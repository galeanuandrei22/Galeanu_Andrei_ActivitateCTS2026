public class MeterModel {
    private final String modelName;
    private final String firmwareVersion;
    private final int maxVoltage;

    public MeterModel(String model, String fw, int volt) {
        this.modelName = model;
        this.firmwareVersion = fw;
        this.maxVoltage = volt;
    }

    public void displayReport(String serialNumber, double currentLoad) {
        System.out.println("SN: " + serialNumber + " model " + modelName + "(firmware: " + firmwareVersion + ") consum: " + currentLoad);
    }
}
