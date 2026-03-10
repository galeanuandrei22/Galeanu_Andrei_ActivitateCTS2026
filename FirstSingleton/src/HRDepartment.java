public class HRDepartment {
    public void printContract() {
        PrinterManager printer = PrinterManager.getInstance();
        printer.printDocument("HR", "contract1.pdf");
    }
}
