public class ConsoleDisplay implements DisplayDevice {
    @Override
    public void render(String data) {
        System.out.println("afisare text: " + data);
    }
}
