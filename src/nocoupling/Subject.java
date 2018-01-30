package nocoupling;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void subscribeToTopic(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribeFromTopic(Observer observer) {
        observers.remove(observer);
    }

    public void publishToTopic() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
