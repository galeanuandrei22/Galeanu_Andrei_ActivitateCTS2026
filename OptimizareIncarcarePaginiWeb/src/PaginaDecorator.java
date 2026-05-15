import java.util.List;

public abstract class PaginaDecorator implements IPaginaWeb {
    protected IPaginaWeb paginaDecorata;

    public PaginaDecorator(IPaginaWeb pagina) {
        this.paginaDecorata = pagina;
    }

    @Override
    public List<Item> getElemente() {
        return paginaDecorata.getElemente();
    }

    @Override
    public void afiseazaPagina() {
        paginaDecorata.afiseazaPagina();
    }
}
