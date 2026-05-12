import java.util.HashMap;
import java.util.Map;

public class ConfigProvider {
    private static Map<String, ServerConfig> configs = new HashMap<>();

    public static ServerConfig getConfig(String ip, String region) {
        String key = ip + region;
        if(!configs.containsKey(key)) {
            configs.put(key, new ServerConfig(ip, region));
        }
        return configs.get(key);
    }
}
