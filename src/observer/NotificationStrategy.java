package observer;

import model.User;

public interface NotificationStrategy {
    void sendNotification(User user, String message);
}
