import java.util.ArrayList;
import java.util.List;

public class UserGroup implements Recipient {
    private List<Recipient> members = new ArrayList<>();

    public void add(Recipient r) {
        members.add(r);
    }

    @Override
    public void receive(NotificationTemplate method, String message) {
        for(Recipient r : members) {
            r.receive(method, message);
        }
    }
}
