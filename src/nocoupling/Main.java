package nocoupling;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.sun();

        WeatherSubject.get().subscribeToTopic(() -> System.out.println("Observer 1"));

        simulation.rain();

        WeatherSubject.get().subscribeToTopic(() -> System.out.println("Observer 2"));
        simulation.sun();
        simulation.rain();

        // Should do nothing since it is already raining
        simulation.rain();
    }
}
