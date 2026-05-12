import java.util.HashMap;
import java.util.Map;

public class StyleFactory {
    private static Map<String, CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(String font, int size, String color) {
        String key = font + size + color;
        if(!styles.containsKey(key)) {
            styles.put(key, new CharacterStyle(font, size, color));
            System.out.println("stil nou creat in memorie..");
        }
        return styles.get(key);
    }
}
