public class Main {
    public static void main(String[] args) {
        User u1 = new User("Ionut");
        User u2 = new User("Marian");
        User u3 = new User("Ioana");

        UserGroup amici = new UserGroup();
        amici.add(u1);
        amici.add(u2);

        UserGroup prieteni = new UserGroup();
        prieteni.add(amici);
        prieteni.add(u3);

        NotificationTemplate emailService = new EmailNotification();
        NotificationTemplate smsService = new SmsNotification();

        prieteni.receive(emailService, "salutare prieteni!");

        amici.receive(smsService, "hei amice!");
    }
}
