import java.util.HashMap;
import java.util.Map;

public class MeterFactory {
    private static final Map<String, MeterModel> models = new HashMap<>();

    public static MeterModel getModel(String name, String fw, int volt) {
        if(!models.containsKey(name)) {
            models.put(name, new MeterModel(name, fw, volt));
            System.out.println("s-a retinut profilul " + name);
        }
        return models.get(name);
    }
}
