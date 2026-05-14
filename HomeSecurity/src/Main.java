public class Main {
    public static void main(String[] args) {
        MotionSensor frontSensor = new MotionSensor();
        AlarmSystem alarm = new AlarmSystem();
        LightSystem philipsHue = new LightSystem();

        SmartHomeFacade homeApp = new SmartHomeFacade(frontSensor, alarm, philipsHue);
        homeApp.activateAwayMode();
        homeApp.simulateIntrusion();
    }
}
