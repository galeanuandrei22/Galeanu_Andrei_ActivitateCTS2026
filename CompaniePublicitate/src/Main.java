public class Main {
    public static void main(String[] args) {
        ProdusMarketing p1 = ProdusFactory.createProdus("poster");
        ProdusMarketing p2 = ProdusFactory.createProdus("flyer");
        ProdusMarketing p3 = ProdusFactory.createProdus("sticker");

        p1.afiseaza();
        p2.afiseaza();
        p3.afiseaza();

        BannerStradal b1 = BannerStradal.getInstance("fashion.ro", "ClientA");
        BannerStradal b2 = BannerStradal.getInstance("auto.ro", "ClientB");
        BannerStradal b3 = BannerStradal.getInstance("fashion.ro", "ClientC");

        b1.afiseaza();
        b2.afiseaza();
        b3.afiseaza();
    }
}
