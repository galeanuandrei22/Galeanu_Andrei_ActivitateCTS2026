import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Pantof p1 = new Pantof.Builder("tenesi", 40, 1.0, "textil").build();
            Pantof p2 = new Pantof.Builder("ghete", 42, 2.5, "piele").materialeSecundare(Arrays.asList("siret", "metal")).build();
            Pantof p3 = new Pantof.Builder("adidasi", 40, 1.0, "textil").mesaje(Arrays.asList("Adidas", "Nr 1")).build();
            Pantof p4 = new Pantof.Builder("alti pantofi", 38, 10.0, "piele").materialeSecundare(Arrays.asList("pietre", "glitter")).mesaje(Arrays.asList("da")).build();
            Pantof p5 = new Pantof.Builder("pantofi", 37, 2.5, "piele").materialeSecundare(Arrays.asList("aur", "argint")).build();

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
            System.out.println(p5);
        } catch (MagazinPantofException e) {
            System.out.println("eroare: " + e.getMessage());
        }
    }
}
