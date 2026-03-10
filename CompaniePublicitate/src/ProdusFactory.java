public class ProdusFactory {
    public static ProdusMarketing createProdus(String tip) {
        switch (tip) {
            case "poster":
                return new Poster();

            case "flyer":
                return new Flyer();

            case "sticker":
                return new Sticker();

            default:
                throw new IllegalArgumentException("tip de produs necunoscut!");
        }
    }
}
