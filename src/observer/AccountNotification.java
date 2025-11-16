package observer;

import model.User;

public class AccountNotification implements NotificationStrategy {

    @Override
    public void sendNotification(User user, Notification notification) {
        System.out.println("Account Notification to" + user.getName() + ":" + notification.getMessage());
    }
}
