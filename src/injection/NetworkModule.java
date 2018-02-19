package injection;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class NetworkModule {

  @Provides
  @Singleton
  UserSettings providesUserSettings() {
    return new UserSettings();
  }

}
