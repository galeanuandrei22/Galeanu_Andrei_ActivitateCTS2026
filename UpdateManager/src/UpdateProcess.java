public abstract class UpdateProcess {
    public final void executeUpdate() {
        download();
        if(verifySignature()) {
            applyUpdate();
        }
        cleanup();
    }
    private void download() {
        System.out.println("se descarca pachetul de update..");
    }

    private void cleanup() {
        System.out.println("se sterg fisierele folosite pentru update...");
    }

    protected abstract boolean verifySignature();
    protected abstract void applyUpdate();
}
