package observer;

import model.User;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Email Notification to " + user.getName() + ": " + message);
    }
}
