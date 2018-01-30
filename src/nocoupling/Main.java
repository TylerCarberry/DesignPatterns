package nocoupling;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.hurricane();

        Observer newsObserver1 = new Observer() {
            @Override
            public void update() {
                System.out.println("Observer with anonymous class");
            }
        };

        NewsSubject.get().subscribeToTopic(newsObserver1);

        simulation.hurricane();

        NewsSubject.get().subscribeToTopic(() -> System.out.println("Observer with lambda"));
        simulation.hurricane();
        simulation.carCrash();
    }
}
