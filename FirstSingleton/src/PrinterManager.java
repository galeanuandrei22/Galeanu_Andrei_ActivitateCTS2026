public class PrinterManager {
    private static PrinterManager instance;

    private PrinterManager() {
        System.out.println("printer initializat!");
    }

    public static PrinterManager getInstance() {
        if(instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public void printDocument(String department, String documentName) {
        System.out.println(department + " a printat documentul " + documentName);
    }
}
