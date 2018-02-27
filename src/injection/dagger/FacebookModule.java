package injection.dagger;

import dagger.Module;
import dagger.Provides;
import injection.*;

import javax.inject.Singleton;

@Module
public class FacebookModule {

  @Provides
  @Singleton
  UserSettings providesUserSettings() {
    return new UserSettings();
  }

  @Provides
  @Singleton
  FacebookApi providesFacebookApi(NetworkManager networkManager, ImageResizer imageResizer, UserSettings userSettings) {
    return new FacebookApi(networkManager, imageResizer, userSettings);
  }

  @Provides
  @Singleton
  NetworkManager providesNetworkManager(WifiManager wifiManager, NetworkCache networkCache) {
    return new NetworkManager(wifiManager, networkCache);
  }

  @Provides
  @Singleton
  WifiManager providesWifiManager() {
    return new WifiManager();
  }

  @Provides
  @Singleton
  ImageResizer providesImageResizer(Cache cache) {
    return new ImageResizer(cache);
  }

  @Provides
  @Singleton
  Cache providesCache() {
    return new Cache();
  }

  @Provides
  @Singleton
  NetworkCache providesNetworkCache(Cache cache) {
    return new NetworkCache(cache);
  }

}
