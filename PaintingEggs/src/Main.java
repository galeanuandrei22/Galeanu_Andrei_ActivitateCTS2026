public class Main {
    public static void main(String[] args) {
        EggComponent egg = new GlitterDecorator(new StickerDecorator(new Egg(new RedEggStrategy())));
        System.out.println(egg.decorate());
    }
}