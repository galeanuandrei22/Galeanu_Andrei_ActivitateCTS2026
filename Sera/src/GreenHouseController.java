import java.util.ArrayList;
import java.util.List;

public class GreenHouseController {
    private List<SensorListener> listeners = new ArrayList<>();

    public void addListener(SensorListener listener) {
        listeners.add(listener);
    }

    public void updateSensors(String type, int value) {
        System.out.println("senzor: noua citire - " + type + " = " + value);
        for(SensorListener listener : listeners) {
            listener.onConditionChange(type, value);
        }
    }
}
