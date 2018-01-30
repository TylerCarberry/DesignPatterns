package nocoupling;

public class Simulation {

    private WeatherData weatherData;

    public Simulation() {
        weatherData = new WeatherData();
    }

    public void rain() {
        weatherData.setHumidity(90);
    }

    public void sun() {
        weatherData.setHumidity(10);
    }

}
