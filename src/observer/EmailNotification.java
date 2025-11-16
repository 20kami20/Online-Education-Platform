package observer;

import model.User;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void sendNotification(User user, Notification notification) {
        System.out.println("Email Notification to " + user.getName() + ": " + notification.getMessage());
    }
}
