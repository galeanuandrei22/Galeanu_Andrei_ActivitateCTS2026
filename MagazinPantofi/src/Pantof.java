import java.util.List;

public class Pantof {
    private final String tip;
    private final int numar;
    private final double toc;
    private final String materialBaza;
    private final List<String> materialeSecundare;
    private final List<String> mesaje;

    private Pantof(Builder builder) {
        this.tip = builder.tip;
        this.numar = builder.numar;
        this.toc = builder.toc;
        this.materialBaza = builder.materialBaza;
        this.materialeSecundare = builder.materialeSecundare;
        this.mesaje = builder.mesaje;
    }

    public static class Builder {
        private String tip;
        private int numar;
        private double toc;
        private String materialBaza;
        private List<String> materialeSecundare;
        private List<String> mesaje;

        public Builder(String tip, int numar, double toc, String materialBaza) {
            this.tip = tip;
            this.numar = numar;
            this.toc = toc;
            this.materialBaza = materialBaza;
        }

        public Builder materialeSecundare(List<String> materiale) {
            this.materialeSecundare = materiale;
            return this;
        }

        public Builder mesaje(List<String> mesaje) {
            this.mesaje = mesaje;
            return this;
        }

        public Pantof build() throws MagazinPantofException {
            if(numar < 35 || numar > 45) {
                throw new MagazinPantofException("nr pantofului trebuie sa fie intre 35 si 45");
            }

            if(toc < 0.5 || toc > 12.5) {
                throw new MagazinPantofException("nr tocului trebuie sa fie intre 0.5 si 12.5");
            }

            if(tip.equals("balerini") && materialeSecundare != null && materialeSecundare.size() > 1) {
                throw new MagazinPantofException("acest tip de pantof poate avea maxim un material suplimentar");
            }

            if(mesaje != null) {
                int total = 0;
                for(String m : mesaje) {
                    total += m.length();
                }
                if(total >= numar) {
                    throw new MagazinPantofException("mesaje prea lungi pentru dimensiunea pantofului!");
                }
            }
            return new Pantof(this);
        }
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tip='" + tip + '\'' +
                ", numar=" + numar +
                ", toc=" + toc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialeSecundare=" + materialeSecundare +
                ", mesaje=" + mesaje +
                '}';
    }
}
