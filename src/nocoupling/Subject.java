package nocoupling;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<K> {

    private List<Observer<K>> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void subscribeToTopic(Observer<K> observer) {
        observers.add(observer);
    }

    public void unsubscribeFromTopic(Observer<K> observer) {
        observers.remove(observer);
    }

    public void publishToTopic(K value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

}
