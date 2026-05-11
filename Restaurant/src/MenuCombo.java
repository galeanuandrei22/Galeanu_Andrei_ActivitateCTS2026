import java.util.ArrayList;
import java.util.List;

public class MenuCombo implements MenuComponent {
    private String comboName;
    private List<MenuComponent> components = new ArrayList<>();

    public MenuCombo(String comboName) {
        this.comboName = comboName;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("combo: " + comboName);
        for(MenuComponent c : components) {
            c.print();
        }
    }

    @Override
    public double getPrice() {
        return components.stream().mapToDouble(MenuComponent::getPrice).sum() * 0.89;
    }
}
