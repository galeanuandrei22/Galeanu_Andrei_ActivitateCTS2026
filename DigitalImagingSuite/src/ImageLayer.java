public class ImageLayer extends Layer {
    public ImageLayer(String name) {
        super(name);
        this.pixelData = new byte[1024];
    }

    @Override
    public Layer clone() {
        ImageLayer copy = new ImageLayer(this.layerName + " (copie)");
        copy.pixelData = this.pixelData.clone();
        return copy;
    }
}
