package observer;

public class WeatherData {

    private double temperature;
    private double humidity;
    private Subject subject;

    public WeatherData() {
        temperature = 0.0;
        humidity = 0.0;
        subject = new Subject();
    }

    public void onMeasurementsChanged() {
        subject.notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        double oldTemp = this.temperature;
        this.temperature = temperature;

        if (oldTemp != this.temperature) {
            onMeasurementsChanged();
        }
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        double oldHumidity = this.humidity;
        this.humidity = humidity;

        if (oldHumidity != this.humidity) {
            onMeasurementsChanged();
        }
    }

    public void registerObserver(Observer observer) {
        subject.registerObserver(observer);
    }

    public void removeObserver(Observer observer) {
        subject.removeObserver(observer);
    }

}
