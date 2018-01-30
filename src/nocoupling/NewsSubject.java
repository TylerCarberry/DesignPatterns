package nocoupling;

public class NewsSubject extends Subject {

    private static Subject INSTANCE;

    private NewsSubject() {
        super();
    }

    public static Subject get() {
        if (INSTANCE == null) {
            INSTANCE = new NewsSubject();
        }
        return INSTANCE;
    }
}
