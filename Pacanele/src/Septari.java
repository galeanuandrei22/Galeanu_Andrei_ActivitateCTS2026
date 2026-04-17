public class Septari extends SlotGameTemplate {
    private String[] currentRow;

    @Override
    protected void generateSymbols() {
        currentRow = SymbolGenerator.generateRow();
        System.out.println("\n[ " + currentRow[0] + " | " + currentRow[1] + " | " + currentRow[2] + " ]");
    }

    @Override
    protected void calculateWinnings() {
        if (currentRow[0].equals(currentRow[1]) && currentRow[1].equals(currentRow[2])) {
            System.out.println("Ai prins pot-ul cel mare!");
        } else if (currentRow[0].equals(currentRow[1]) || currentRow[1].equals(currentRow[2]) || currentRow[0].equals(currentRow[2])) {
            System.out.println("Meh, se putea mai bine");
        } else {
            System.out.println("Te-ai racorit!");
        }
    }
}
