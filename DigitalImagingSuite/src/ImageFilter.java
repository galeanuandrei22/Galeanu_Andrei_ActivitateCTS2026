public abstract class ImageFilter {
    protected RenderingEngine engine;
    protected ImageFilter(RenderingEngine e) {
        this.engine = e;
    }
    public abstract void apply();
}
