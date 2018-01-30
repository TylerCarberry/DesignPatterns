package nocoupling;

public class Main {

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.hurricane();

        Observer<News> newsObserver1 = new Observer<News>() {
            @Override
            public void update(News value) {
                System.out.println("Breaking news: " + value.getHeadline());
            }
        };

        NewsSubject.get().subscribeToTopic(newsObserver1);

        simulation.hurricane();

        NewsSubject.get().subscribeToTopic((News news) -> System.out.println("News alert: " + news.getHeadline()));
        simulation.hurricane();
        simulation.carCrash();
    }
}
