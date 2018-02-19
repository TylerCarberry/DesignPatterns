package injection;

public class InjectionMain {

  public static void main(String[] args) {
    System.out.println("STARTING PROGRAM");

    Tester tester = new Tester();

    tester.printHello();


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
