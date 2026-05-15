import java.util.ArrayList;
import java.util.List;

public class FiltruTextDecorator extends PaginaDecorator {
    public FiltruTextDecorator(IPaginaWeb pagina) {
        super(pagina);
    }

    @Override
    public List<Item> getElemente() {
        List<Item> elemente = new ArrayList<>();
        for(Item item : elemente) {
            if(!item.getTip().equalsIgnoreCase("pragraf")) {
                item.setStil("doar culoare negru");
            }
        }
        return elemente;
    }

    @Override
    public void afiseazaPagina() {
        System.out.println("s-au optimizat paragrafele");
        List<Item> elemente = this.getElemente();
        for(Item item : elemente) {
            System.out.println(" " + item);
        }
    }
}
