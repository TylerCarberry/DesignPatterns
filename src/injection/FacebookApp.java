package injection;

import injection.dagger.DaggerFacebookComponent;

import javax.inject.Inject;

public class FacebookApp {

  @Inject FacebookApi facebookApi;
  @Inject NetworkManager networkManager;

  public FacebookApp() {
    DaggerFacebookComponent.create().inject(this);
  }

  public void printHello() {
    facebookApi.postOnFacebook("Having a great time in OOD!");
    facebookApi.postImage("https://www.petmd.com/sites/default/files/petmd-cat-happy-10.jpg");

    // Since network manager is a singleton, they are they same object
    assert(facebookApi.getNetworkManager() == networkManager);
  }

}
