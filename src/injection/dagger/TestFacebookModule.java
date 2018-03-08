package injection.dagger;

import dagger.Module;
import dagger.Provides;
import injection.*;
import org.mockito.Mockito;

import javax.inject.Singleton;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Provides Mock components for some objects, real objects for others
 */
@Module
public class TestFacebookModule {

    @Provides
    @Singleton
    UserSettings providesUserSettings() {
        UserSettings userSettings = mock(UserSettings.class);
        when(userSettings.getLanguage()).thenReturn("French");
        Mockito.doReturn("AlarmNotification").when(userSettings).configureAlarmNotificationLevel(Mockito.any(UserSettings.AlarmConfigLevel.class));
        return userSettings;
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
        WifiManager wifiManager = mock(WifiManager.class);
        when(wifiManager.getConnectionInfo()).thenReturn("cnt-info-1234");
        when(wifiManager.isClearpassWorking()).thenReturn(true);
        return wifiManager;
    }

    @Provides
    @Singleton
    ImageResizer providesImageResizer(Cache cache) {
        return new ImageResizer(cache);
    }

    @Provides
    @Singleton
    Cache providesCache() {
        Cache cache = mock(Cache.class);
        when((cache).empty()).thenReturn("Never empty");
        when((cache).getContents()).thenReturn("got cached contents woo");
        return cache;
    }

    @Provides
    @Singleton
    NetworkCache providesNetworkCache(Cache cache) {
        return new NetworkCache(cache);
    }

}
