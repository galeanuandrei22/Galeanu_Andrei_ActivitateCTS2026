import java.util.ArrayList;
import java.util.List;

public class FiltruImagineDecorator extends PaginaDecorator {
    public FiltruImagineDecorator(IPaginaWeb pagina) {
        super(pagina);
    }

    @Override
    public List<Item> getElemente() {
        List<Item> elementeFiltrate = new ArrayList<>();
        for(Item item : super.getElemente()) {
            if(!item.getTip().equalsIgnoreCase("imagine")) {
                elementeFiltrate.add(item);
            }
        }
        return elementeFiltrate;
    }

    @Override
    public void afiseazaPagina() {
        System.out.println("s-au eliminat imaginile pt conexiune slaba");
        List<Item> elemente = this.getElemente();
        for(Item item : elemente) {
            System.out.println(" " + item);
        }
    }
}
