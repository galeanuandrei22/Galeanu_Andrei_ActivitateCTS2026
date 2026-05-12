public class FirewallFilter extends NetworkFilter {

    @Override
    public void filter(String packet) {
        if(packet.contains("malware")) {
            System.out.println("pachet blocat!");
        } else if(next != null) {
            next.filter(packet);
        }
    }
}
