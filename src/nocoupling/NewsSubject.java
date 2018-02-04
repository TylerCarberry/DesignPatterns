package nocoupling;

public class NewsSubject extends Subject<News> {

    private static volatile NewsSubject INSTANCE;

    private NewsSubject() {
        super();
    }

    public static NewsSubject get() {
        if (INSTANCE == null) {
            synchronized (NewsSubject.class) {
                if (INSTANCE == null) {
                    INSTANCE = new NewsSubject();
                }
            }
        }
        return INSTANCE;
    }
}
