package injection.dagger;

import dagger.Module;
import dagger.Provides;
import injection.UserSettings;

import javax.inject.Singleton;

@Module
public class FacebookModule {

  @Provides
  @Singleton
  UserSettings providesUserSettings() { return new UserSettings(); }

}
