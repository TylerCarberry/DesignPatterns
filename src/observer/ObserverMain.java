package observer;

public class ObserverMain {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        data.registerObserver(() -> System.out.println("The weather has changed!"));

        data.setHumidity(5);

        data.registerObserver(() -> {
            double temperature = data.getTemperature();
            double humidity = data.getHumidity();
            System.out.print("The temperature is " + temperature);
            System.out.println(" and the humidity is " + humidity);
        });

        data.setTemperature(70);
        data.setHumidity(10);

        // Should do nothing
        data.setHumidity(10);
    }
}
