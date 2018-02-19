package injection;

import javax.inject.Inject;

public class Tester {

  @Inject UserSettings userSettings;

  public Tester() {
    DaggerAppComponent.builder().build().inject(this);
  }

  public void printHello() {
    if (userSettings.getLanguage().equals("English")) {
      System.out.println("Hello");
    } else {
      System.out.println("Hola");
    }
  }


}
