public abstract class EggDecorator implements EggComponent{
    protected EggComponent component;

    public EggDecorator(EggComponent component) {
        this.component = component;
    }
}
