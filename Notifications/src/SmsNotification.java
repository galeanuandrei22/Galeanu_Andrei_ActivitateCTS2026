public class SmsNotification extends NotificationTemplate {
    @Override
    protected void connectToService() {
        System.out.println("conectare la rețeaua GSM...");
    }

    @Override
    protected void deliver(String message) {
        System.out.println("trimitere text scurt: " + message);
    }
}
