import java.util.ArrayList;
import java.util.List;

public class StationSector implements StationComponent {
    private String sectorName;
    private List<StationComponent> children = new ArrayList<>();

    public StationSector(String name) {
        this.sectorName = name;
    }

    public void addComponent(StationComponent c) {
        children.add(c);
    }

    @Override
    public void showStructure() {
        System.out.println("sector: " + sectorName);
        for(StationComponent child : children) {
            child.showStructure();
        }
    }
}
