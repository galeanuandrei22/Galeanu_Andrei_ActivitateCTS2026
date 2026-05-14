public class SmartHomeFacade {
    private MotionSensor sensor;
    private AlarmSystem alarm;
    private LightSystem lights;

    public SmartHomeFacade(MotionSensor s, AlarmSystem a, LightSystem l) {
        this.sensor = s;
        this.alarm = a;
        this.lights = l;
    }

    public void activateAwayMode() {
        System.out.println("se activeaza sistemele de alarmare!");
        lights.update("lights_out");
        sensor.addDevice(alarm);
        sensor.addDevice(lights);
        System.out.println("sistemul a fost activat!");
    }

    public void simulateIntrusion() {
        sensor.detectMovement();
    }
}
