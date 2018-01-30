package nocoupling;

public class WeatherSubject extends Subject {

    private static Subject INSTANCE;

    private WeatherSubject() {
        super();
    }

    public static Subject get() {
        if (INSTANCE == null) {
            INSTANCE = new WeatherSubject();
        }
        return INSTANCE;
    }
}
