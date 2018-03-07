package injection;

public class Main {

  public static void main(String[] args) {
    System.out.println("STARTING PROGRAM");
    //runs just general test without mockito
    FacebookApp facebookApp = new FacebookApp();
    facebookApp.printHello();
    //runs tests with mockito for facebook api and all component
    new TestsWithMockito();


    // Facebook API client has a
    // • Network manager
    // • ImageResizer

    // Network Manager has a
    // • Wifi Connection
    // • Network cache

    // ImageResizer has a
    // • Cache file

    // Network Cache has a
    // • Cache file

  }

}
