public class Main {
    public static void main(String[] args) {
        ImageLayer background = new ImageLayer("background");
        Layer layerCopy = background.clone();

        background.info();
        layerCopy.info();

        LayerStack project = new LayerStack();
        project.addLayer(background);
        project.addLayer(new ImageLayer("text"));
        project.addLayer(new ImageLayer("efecte"));

        for(Layer l : project) {
            l.info();
        }

        ImageFilter filterGPU = new SepiaFilter(new GPUEngine());

        filterGPU.apply();
    }
}
