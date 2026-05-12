public class Main {
    public static void main(String[] args) {
        ConnectionFactory sshService = new SSHFactory();
        sshService.startService();

        NetworkFilter firewall = new FirewallFilter();
        NetworkFilter logger = new LogFilter();
        firewall.setNext(logger);

        System.out.println("se analizeaza pachetul 1");
        firewall.filter("date_sensibile");

        System.out.println("se analizeaza pachetul 2");
        firewall.filter("ceva_malware");

        System.out.println("management resurse cloud");
        ServerConfig commonServer = ConfigProvider.getConfig("192.168.1.1", "Europa");

        commonServer.route(80);
        commonServer.route(7777);
        commonServer.route(8080);
    }
}
