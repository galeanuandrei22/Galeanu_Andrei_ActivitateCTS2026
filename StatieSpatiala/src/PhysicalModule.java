public class PhysicalModule implements StationComponent {
    private String name;
    public PhysicalModule(String name) {
        this.name = name;
    }

    @Override
    public void showStructure() {
        System.out.println("modul fizic: " + name);
    }
}
