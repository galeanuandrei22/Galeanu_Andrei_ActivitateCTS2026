import java.util.HashMap;
import java.util.Map;

public class MetadataFactory {
    private static Map<String, FileMetadata> cache = new HashMap<>();

    public static FileMetadata getMetadata(String permissions, String owner) {
        String key = permissions + owner;
        if(!cache.containsKey(key)) {
            cache.put(key, new FileMetadata(permissions, owner));
        }
        return cache.get(key);
    }
}
