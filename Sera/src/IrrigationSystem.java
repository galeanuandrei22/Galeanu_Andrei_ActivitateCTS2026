public class IrrigationSystem implements  SensorListener {
    @Override
    public void onConditionChange(String type, int value) {
        if(type.equalsIgnoreCase("humidity") && value < 40) {
            System.out.println("umiditate scazuta, se porneste irigarea..");
        }
    }
}
