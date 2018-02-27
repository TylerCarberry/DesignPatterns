package injection;

import injection.dagger.DaggerFacebookComponent;

import javax.inject.Inject;

public class Tester {

  @Inject UserSettings userSettings;

  public Tester() {
    DaggerFacebookComponent.create().inject(this);
  }

  public void printHello() {
    if (userSettings.getLanguage().equals("English")) {
      System.out.println("Hello");
    } else {
      System.out.println("Hola");
    }
  }


}
