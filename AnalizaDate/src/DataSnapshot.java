import java.util.ArrayList;
import java.util.List;

public class DataSnapshot implements Cloneable {
    private List<String> cachedData = new ArrayList<>();

    public void addData(String d) {
        cachedData.add(d);
    }

    @Override
    public DataSnapshot clone() {
        try {
            DataSnapshot copy = (DataSnapshot) super.clone();
            copy.cachedData = new ArrayList<>(this.cachedData);
            return copy;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    public void show() {
        System.out.println("date snapshopt " + cachedData);
    }
}
