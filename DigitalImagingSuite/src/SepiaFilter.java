public class SepiaFilter extends ImageFilter {
    public SepiaFilter(RenderingEngine e) {
        super(e);
    }

    @Override
    public void apply() {
        engine.render("sepia");
    }
}
