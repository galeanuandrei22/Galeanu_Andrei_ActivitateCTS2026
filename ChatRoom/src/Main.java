public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User u1 = new ChatUser(chatRoom, "Marian");
        User u2 = new ChatUser(chatRoom, "Andrei");
        User u3 = new ChatUser(chatRoom, "Irina");

        chatRoom.addUser(u1);
        chatRoom.addUser(u2);
        chatRoom.addUser(u3);

        u1.send("Salutare!");
    }
}
