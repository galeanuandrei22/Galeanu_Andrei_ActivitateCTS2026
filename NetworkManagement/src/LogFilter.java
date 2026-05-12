public class LogFilter extends NetworkFilter {
    @Override
    public void filter(String packet) {
        System.out.println("pachetul " + packet + " a fost inregistrat");
        if(next != null) next.filter(packet);
    }
}
