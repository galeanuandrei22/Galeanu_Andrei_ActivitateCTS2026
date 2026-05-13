public abstract class Layer implements Cloneable{
    protected String layerName;
    protected byte[] pixelData;

    public Layer(String name) {
        this.layerName = name;
    }

    @Override
    public abstract Layer clone();

    public void info() {
        System.out.println("layer: " + layerName + " hash date " + (pixelData != null ? pixelData.hashCode() : "gol"));
    }
}
