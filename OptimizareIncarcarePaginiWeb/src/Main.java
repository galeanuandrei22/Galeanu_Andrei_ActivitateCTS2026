public class Main {
    public static void main(String[] args) {

        PaginaWeb paginaStiri = new PaginaWeb("www.stiri-it.ro");
        paginaStiri.adaugaItem(new Item("PARAGRAF", "Titlu: Lansare tehnologie nouă", "Bold-Red"));
        paginaStiri.adaugaItem(new Item("IMAGINE", "Bannner_Prezentare.png", "High-Definition"));
        paginaStiri.adaugaItem(new Item("PARAGRAF", "Continut articol...", "Italic-Grey"));

        paginaStiri.afiseazaPagina();

        IPaginaWeb paginaStiriOptimizata = new FiltruTextDecorator(new FiltruImagineDecorator(paginaStiri));
        paginaStiriOptimizata.afiseazaPagina();


        PaginaWeb paginaBlog = new PaginaWeb("www.blog-calatorii.ro");
        paginaBlog.adaugaItem(new Item("IMAGINE", "Plaja_Apus.jpg", "4K-Resolution"));
        paginaBlog.adaugaItem(new Item("PARAGRAF", "Review hotel 5 stele", "Bold-Gold"));
        paginaBlog.adaugaItem(new Item("IMAGINE", "Harta_Traseu.png", "Medium-Quality"));

        paginaBlog.afiseazaPagina();

        IPaginaWeb paginaBlogDoarFaraImagini = new FiltruImagineDecorator(paginaBlog);
        paginaBlogDoarFaraImagini.afiseazaPagina();
    }
}