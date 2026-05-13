public class CriticalState implements SystemState {
    public void handleAlert(LifeSupportContext context) {
        System.out.println("protocol de urgenta activ.. nu se pot schimba manual setarile");
    }
    public String getStatus() {
        return "alerta!!! eroare sistem!";
    }
}
