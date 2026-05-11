public class OSUpdate extends UpdateProcess {
    @Override
    protected boolean verifySignature() {
        System.out.println("verificare semnatura digitala: ok.");
        return true;
    }

    @Override
    protected void applyUpdate() {
        System.out.println("se rescriu fisierele cu noile aditii..");
    }
}
