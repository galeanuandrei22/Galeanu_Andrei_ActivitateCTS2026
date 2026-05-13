public class NormalState implements SystemState {
    public void handleAlert(LifeSupportContext context) {
        System.out.println("problema detectata! trecem in modul critic!");
        context.setState(new CriticalState());
    }
    public String getStatus() {
        return "functionare normala..";
    }
}
