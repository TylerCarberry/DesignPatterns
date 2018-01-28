package nocoupling;

public class ObserverMain {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        data.setHumidity(5);

        ObserverManager.get().subscribeToTopic("weather", new Observer() {
            @Override
            public void update() {
                System.out.println("The weather has changed");
            }
        });

        data.setTemperature(70);
        data.setHumidity(10);

        // Should do nothing
        data.setHumidity(10);
    }
}
