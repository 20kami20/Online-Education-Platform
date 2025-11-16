package observer;

import model.User;

public interface NotificationStrategy {
    void sendNotification(User user, Notification notification);
}
