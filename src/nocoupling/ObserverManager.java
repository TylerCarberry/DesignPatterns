package nocoupling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverManager {

    private static ObserverManager INSTANCE;
    private Map<String, List<Observer>> observerMap;

    private ObserverManager() {
        observerMap = new HashMap<>();
    }

    public static ObserverManager get() {
        if (INSTANCE == null) {
            INSTANCE = new ObserverManager();
        }
        return INSTANCE;
    }

    public void subscribeToTopic(String topicName, Observer observer) {
        observerMap.computeIfAbsent(topicName, observers -> new ArrayList<>());

        List<Observer> observers = observerMap.get(topicName);
        observers.add(observer);
    }

    public void unsubscribeFromTopic(String topicName, Observer observer) {
        observerMap.get(topicName).remove(observer);
    }

    public void publishToTopic(String topicName) {
        List<Observer> observers = observerMap.getOrDefault(topicName, new ArrayList<>());
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
