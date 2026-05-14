public abstract class NotificationTemplate {
    public final void sendNotification(String message) {
        formatMessage(message);
        connectToService();
        deliver(message);
        logStatus();
    }

    private void formatMessage(String message) {
        System.out.println("mesaj pregatit pentru trimitere");
    }

    private void logStatus() {
        System.out.println("status salvat!");
    }

    protected abstract void connectToService();
    protected abstract void deliver(String message);
}
