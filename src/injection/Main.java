package injection;

public class Main {

    public static void main(String[] args) {
        // Runs just general test without mockito
        FacebookApp facebookApp = new FacebookApp();
        facebookApp.useFacebook();

        // Runs tests with mockito for facebook api and all components
        new TestsWithMockito().runTests();

    }

}
