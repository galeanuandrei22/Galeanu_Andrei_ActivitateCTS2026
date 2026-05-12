public class CharacterStyle {
    private final String font;
    private final int size;
    private final String color;

    public CharacterStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void render(char character) {
        System.out.println("litera " + character + " desenata cu " + font + " " + size + "px " + color);
    }
}
