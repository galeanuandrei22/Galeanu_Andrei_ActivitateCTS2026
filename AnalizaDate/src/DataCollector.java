public abstract class DataCollector {
    protected DisplayDevice display;
    protected DataCollector(DisplayDevice d) {
        this.display = d;
    }
    public abstract void collect();
}
