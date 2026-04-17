import java.util.Random;

public class SymbolGenerator {
    private static final String[] SYMBOLS = {"🍒", "🍋", "🔔", "⭐", "7️⃣"};
    private static final Random random = new Random();

    public static String[] generateRow() {
        return new String[]{
                SYMBOLS[random.nextInt(SYMBOLS.length)],
                SYMBOLS[random.nextInt(SYMBOLS.length)],
                SYMBOLS[random.nextInt(SYMBOLS.length)]
        };
    }
}
