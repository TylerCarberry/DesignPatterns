package injection;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class FacebookModule {

  @Provides
  @Singleton
  UserSettings providesUserSettings() {
    return new UserSettings();
  }

}
