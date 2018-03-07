package injection;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestsWithMockito {
    FacebookApi facebookApi = mock(FacebookApi.class);
    NetworkManager networkManager = mock(NetworkManager.class);
    ImageResizer imageResizer = mock(ImageResizer.class);
    NetworkCache networkCache = mock(NetworkCache.class);
    UserSettings userSettings = mock(UserSettings.class);
    WifiManager wifiManager = mock(WifiManager.class);
    Cache cache = mock(Cache.class);
    TestsWithMockito(){
        print("================ Running Mockito TestsWithMockito for FacebookApi =============");

        testUserSettings();
        testWifiManager();
        testCache();
        testImageResizer();
        testNetworkCache();
        testNetworkManager();
        testFacebookApi();
    }

    void testUserSettings(){
        print("==== Testing UserSettings===");
        when(userSettings.getLanguage()).thenReturn("French");
        Mockito.doReturn("AlarmNotification").when(userSettings).configureAlarmNotificationLevel(Mockito.any(UserSettings.AlarmConfigLevel.class));
        print(userSettings.configureAlarmNotificationLevel(UserSettings.AlarmConfigLevel.NONE));
        print(userSettings.getLanguage());
    }

    void testWifiManager(){
        print("==== Testing WifiManager===");
        when(wifiManager.getConnectionInfo()).thenReturn("cnt-info-1234");
        when(wifiManager.isClearpassWorking()).thenReturn(true);
        print(wifiManager.getConnectionInfo());
        print(String.valueOf(wifiManager.isClearpassWorking()));
    }

    void testCache(){
        print("==== Testing Cache===");
        when((cache).empty()).thenReturn("Never empty");
        when((cache).getContents()).thenReturn("got cached contents woo");
        print(cache.empty());
        print(cache.getContents());
    }

    void testImageResizer(){
        print("==== Testing ImageResizer===");
        imageResizer = new ImageResizer(cache);
        imageResizer.resize();
    }

    void testNetworkCache(){
        print("==== Testing NetworkCache===");
         networkCache = new NetworkCache(cache);
         networkCache.create();
    }

    void testNetworkManager(){
        print("==== Testing NetworkManager===");
        networkManager = new NetworkManager(wifiManager,networkCache);
        networkManager.connect();
    }

    void testFacebookApi(){
        print("==== Testing FacebookApi===");
        facebookApi = new FacebookApi( networkManager,  imageResizer,  userSettings);
        facebookApi.postImage("test post");
        facebookApi.postOnFacebook("my test message");
    }

    void print(String string){
        System.out.println(string);
    }

}
