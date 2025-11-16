package observer;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class NotificationService {
    private final List<User> users = new ArrayList<>();
    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy =  strategy;
    }

    public void register(User user){ users.add(user); }
    public void unregister(User user){ users.remove(user); }

    public void notifyAll(Notification n){
        for(User u : users) strategy.sendNotification(u, n);
    }
}
