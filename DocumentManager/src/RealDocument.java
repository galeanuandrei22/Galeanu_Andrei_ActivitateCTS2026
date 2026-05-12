public class RealDocument implements Document {
    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("se incarca fisierul " + fileName + " de pe disc..");
    }

    @Override
    public void display() {
        System.out.println("continutul documentului " + fileName + " este vizibil in acest moment");
    }
}
