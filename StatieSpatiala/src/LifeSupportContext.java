public class LifeSupportContext {
    private SystemState state = new NormalState();

    public void setState(SystemState state) {
        this.state = state;
    }

    public void triggerEvent() {
        state.handleAlert(this);
    }

    public void printCurrentStatus() {
        System.out.println("status actual sistem: " + state.getStatus());
    }
}
