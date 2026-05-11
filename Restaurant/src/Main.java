public class Main {
    public static void main(String[] args) {
        MenuComponent burger = new MenuItem("burger pui", 25.00);
        MenuComponent cartofiPrajiti = new MenuItem("cartofi prajiti", 10.00);

        MenuCombo comboFamilie = new MenuCombo("combo familie");
        comboFamilie.add(burger);
        comboFamilie.add(cartofiPrajiti);

        System.out.println("detalii meniu: ");
        comboFamilie.print();
        System.out.println("pret total (cu discount): " + comboFamilie.getPrice());

        Order masa = new Order();
        OrderCommand plaseazaComanda = new PlaceOrderCommand(masa);

        plaseazaComanda.execute();;
        masa.showStatus();

        masa.nextStep();
        masa.showStatus();
    }
}
