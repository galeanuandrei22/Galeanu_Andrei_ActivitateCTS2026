public interface SystemState {
    void handleAlert(LifeSupportContext context);
    String getStatus();
}
