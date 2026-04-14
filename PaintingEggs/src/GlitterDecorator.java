public class GlitterDecorator extends EggDecorator {
    public GlitterDecorator(EggComponent component) {
        super(component);
    }

    @Override
    public String decorate() {
        return component.decorate() + " sclipici";
    }
}
