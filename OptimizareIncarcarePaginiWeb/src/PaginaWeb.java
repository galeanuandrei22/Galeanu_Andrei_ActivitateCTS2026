import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPaginaWeb {
    private String url;
    private List<Item> elemente = new ArrayList<>();

    public PaginaWeb(String url) {
        this.url = url;
    }

    public void adaugaItem(Item item) {
        elemente.add(item);
    }

    @Override
    public List<Item> getElemente() {
        return this.elemente;
    }

    @Override
    public void afiseazaPagina() {
        System.out.println("pagina url " + url);
        for(Item item : elemente) {
            System.out.println(" " + item);
        }
    }
}
