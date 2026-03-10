public class AccountingDepartment {
    public void printReport() {
        PrinterManager printer = PrinterManager.getInstance();
        printer.printDocument("Contabilitate", "documen_financiar.xlsx");
    }
}
