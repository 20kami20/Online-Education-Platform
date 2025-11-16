package observer;

import model.User;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void sendNotification(User user, Notification notification) {
        System.out.println("SMS Notification to" + user.getName() + " : " + notification.getMessage());
    }
}
