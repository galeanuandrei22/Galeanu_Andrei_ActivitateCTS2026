public class ServerConfig {
    private final String ipAddress;
    private final String region;

    public ServerConfig(String ipAddress, String region) {
        this.ipAddress = ipAddress;
        this.region = region;
    }

    public void route(int port) {
        System.out.println("rutare trafic catre " + ipAddress + " regiunea " + region + " pe portul " + port);
    }
}
