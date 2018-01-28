package nocoupling;

public class WeatherData {

    private double temperature;
    private double humidity;

    public WeatherData() {
        temperature = 0.0;
        humidity = 0.0;
    }

    public void onMeasurementsChanged() {
        ObserverManager.get().publishToTopic("weather");
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

}
