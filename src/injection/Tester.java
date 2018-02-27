package injection;

import injection.dagger.DaggerFacebookComponent;

import javax.inject.Inject;

public class Tester {

  @Inject FacebookApi facebookApi;

  public Tester() {
    DaggerFacebookComponent.create().inject(this);
  }

  public void printHello() {
    facebookApi.postOnFacebook("Having a great time in OOD!");
    facebookApi.postImage("https://www.petmd.com/sites/default/files/petmd-cat-happy-10.jpg");
  }

}
