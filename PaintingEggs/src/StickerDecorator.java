public class StickerDecorator extends EggDecorator {
    public StickerDecorator(EggComponent component) {
        super(component);
    }

    @Override
    public String decorate() {
        return component.decorate() + " stickere";
    }
}
