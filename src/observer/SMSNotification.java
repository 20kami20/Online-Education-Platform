package observer;

import model.User;

public class SMSNotification implements NotificationStrategy {
    @Override
    public void sendNotification(User user, String Message){
        System.out.println("SMS Notification to" + user.getName() + " : " + Message);
    }
}
