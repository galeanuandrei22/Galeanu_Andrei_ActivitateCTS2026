public class VaultProxy implements Vault {
    private RealVault realVault;
    private boolean isAuthorized;

    public VaultProxy(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void open() {
        if(isAuthorized) {
            if(realVault == null) {
                realVault = new RealVault();
            }
            realVault.open();
        } else {
            System.out.println("acces interzis!");
        }
    }
}
