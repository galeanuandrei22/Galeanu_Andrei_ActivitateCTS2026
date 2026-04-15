public class CoffeeMachineFacade {
    private CoffeeMachine machine;

    public CoffeeMachineFacade() {
        machine = new CoffeeMachine();
    }

    public void makeCoffee() {
        machine.request();
        machine.request();
    }

    public void setOutOfService() {
        machine.setState(new OutOfServiceState());
    }
}
