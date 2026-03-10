import java.util.HashMap;

public class BannerStradal implements ProdusMarketing {

    private static HashMap<String, BannerStradal> bannere = new HashMap<>();

    private String domeniu;
    private String client;

    private BannerStradal(String domeniu, String client) {
        this.domeniu = domeniu;
        this.client = client;
    }

    public static BannerStradal getInstance(String domeniu, String client) {
        if(bannere.containsKey(domeniu)) {
            System.out.println("banner existent pentru domeniul: " + domeniu);
            return bannere.get(domeniu);
        }

        BannerStradal banner = new BannerStradal(domeniu, client);
        bannere.put(domeniu, banner);

        return banner;
    }

    @Override
    public void afiseaza() {
        System.out.println("banner in domeniul " + domeniu + " creat pentru clientul" + client);
    }
}
