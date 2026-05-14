public class User implements Recipient {
    private String name;
    public User(String name) {
        this.name = name;
    }

    @Override
    public void receive(NotificationTemplate method, String message) {
        System.out.println("\ndestinatar: " + name);
        method.sendNotification(message);
    }
}
