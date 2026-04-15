public class Main {
    public static void main(String[] args) {
        CoffeeMachineFacade facade = new CoffeeMachineFacade();

        System.out.println("Cafea simpla: ");
        facade.makeCoffee();

        System.out.println("\nAparatul nu functioneaza: ");
        facade.setOutOfService();
        facade.makeCoffee();
    }
}
