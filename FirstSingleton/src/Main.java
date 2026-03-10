public class Main {
    public static void main(String[] args) {
        HRDepartment hr = new HRDepartment();
        AccountingDepartment acc = new AccountingDepartment();

        hr.printContract();
        acc.printReport();
    }
}
