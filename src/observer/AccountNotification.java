package observer;

import model.User;

public class AccountNotification implements NotificationStrategy {

    @Override
    public void sendNotification(User user, String message) {
        System.out.println("Account Notification to" + user.getName() + ":" +message);
    }
}
