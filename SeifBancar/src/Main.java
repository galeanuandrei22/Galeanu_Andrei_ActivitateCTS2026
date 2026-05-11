public class Main {
    public static void main(String[] args) {
        AccessFactory factory = new AccessFactory();
        AccessMethod myAccess = factory.createMethod("pin");
        myAccess.authenticate();

        Vault seif = new VaultProxy(false);
        seif.open();

        SecuritySystem security = new SecuritySystem();
        security.setResponseStrategy(new PoliceAlert());
        security.triggerAlarm();
    }
}
