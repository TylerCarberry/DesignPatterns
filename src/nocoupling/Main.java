package nocoupling;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.hurricane();

        NewsSubject.get().subscribeToTopic(() -> System.out.println("Observer 1"));

        simulation.hurricane();

        NewsSubject.get().subscribeToTopic(() -> System.out.println("Observer 2"));
        simulation.hurricane();
        simulation.carCrash();
    }
}
