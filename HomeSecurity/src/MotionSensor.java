import java.util.ArrayList;
import java.util.List;

public class MotionSensor {
    private List<SecurityObserver> devices = new ArrayList<>();

    public void addDevice(SecurityObserver device) {
        devices.add(device);
    }

    public void detectMovement() {
        System.out.println("miscare detectata!");
        for(SecurityObserver device : devices) {
            device.update("motion_detected");
        }
    }
}
