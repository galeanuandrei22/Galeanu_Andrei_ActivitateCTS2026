public class EmailNotification extends NotificationTemplate {
    @Override
    protected void connectToService() {
        System.out.println("conectare la serverul de mail...");
    }

    @Override
    protected void deliver(String message) {
        System.out.println("trimitere conținut: " + message);
    }
}
