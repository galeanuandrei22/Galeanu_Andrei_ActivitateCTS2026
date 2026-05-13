import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LayerStack implements Iterable<Layer> {
    private List<Layer> layers = new ArrayList<>();

    public void addLayer(Layer l) {
        layers.add(l);
    }

    @Override
    public Iterator<Layer> iterator() {
        return new LayerIterator();
    }

    private class LayerIterator implements Iterator<Layer> {
        private int cursor = layers.size() - 1;

        @Override
        public boolean hasNext() {
            return cursor >= 0;
        }

        @Override
        public Layer next() {
            return layers.get(cursor--);
        }
    }
}
