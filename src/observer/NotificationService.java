package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<Observer> observers = new ArrayList<>();

    public void register(Observer o){ observers.add(o); }
    public void unregister(Observer o){ observers.remove(o); }

    public void notifyAll(Notification n){
        for(Observer o : observers) o.update(n);
    }
}
