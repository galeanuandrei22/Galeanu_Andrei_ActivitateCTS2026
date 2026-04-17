import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class StandardDraw implements DrawStrategy {
    @Override
    public Set<Integer> generateNumbers(int count, int range) {
        Set<Integer> numbers = new TreeSet<>();
        Random random = new Random();
        while(numbers.size() < count) {
            numbers.add(random.nextInt(range) + 1);
        }
        return numbers;
    }
}
