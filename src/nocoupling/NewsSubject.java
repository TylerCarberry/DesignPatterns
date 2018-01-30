package nocoupling;

public class NewsSubject extends Subject<News> {

    private static NewsSubject INSTANCE;

    private NewsSubject() {
        super();
    }

    public static NewsSubject get() {
        if (INSTANCE == null) {
            INSTANCE = new NewsSubject();
        }
        return INSTANCE;
    }
}
