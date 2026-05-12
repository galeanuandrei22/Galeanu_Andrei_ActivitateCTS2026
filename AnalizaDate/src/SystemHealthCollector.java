public class SystemHealthCollector extends DataCollector {
    public SystemHealthCollector(DisplayDevice d) {
        super(d);
    }

    @Override
    public void collect() {
        String report = "CPU: 15%, RAM: 8GB";
        display.render(report);
    }
}
