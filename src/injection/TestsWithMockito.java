package injection;

import javax.inject.*;
import injection.dagger.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestsWithMockito {
//    FacebookApi facebookApi = mock(FacebookApi.class);
//    NetworkManager networkManager = mock(NetworkManager.class);
//    ImageResizer imageResizer = mock(ImageResizer.class);
//    NetworkCache networkCache = mock(NetworkCache.class);
//    UserSettings userSettings = mock(UserSettings.class);
//    WifiManager wifiManager = mock(WifiManager.class);
//    Cache cache = mock(Cache.class);

    @Inject FacebookApi facebookApi;
    @Inject NetworkManager networkManager;
    @Inject ImageResizer imageResizer;
    @Inject NetworkCache networkCache;
    @Inject UserSettings userSettings;
    @Inject WifiManager wifiManager;
    @Inject Cache cache;


//    public TestsWithMockito(FacebookApi facebookApi,NetworkManager networkManager,ImageResizer imageResizer,
//                            NetworkCache networkCache,UserSettings userSettings,WifiManager wifiManager,Cache cache){
    public TestsWithMockito() {
//        this.facebookApi = facebookApi;
//        this.networkManager = networkManager;
//        this.imageResizer = imageResizer;
//        this.networkCache = networkCache;
//        this.userSettings = userSettings;
//        this.wifiManager = wifiManager;
//        this.cache = cache;

        DaggerTestFacebookComponent.builder().build().inject(this);

        print("\n================ Running Mockito TestsWithMockito for FacebookApi =============");
        testUserSettings();
        testWifiManager();
        testCache();
        testImageResizer();
        testNetworkCache();
        testNetworkManager();
        testFacebookApi();
    }

    void testUserSettings(){
        print("\n==== Testing UserSettings===");
//        when(userSettings.getLanguage()).thenReturn("French");
//        Mockito.doReturn("AlarmNotification").when(userSettings).configureAlarmNotificationLevel(Mockito.any(UserSettings.AlarmConfigLevel.class));
        print(userSettings.configureAlarmNotificationLevel(UserSettings.AlarmConfigLevel.NONE));
        print(userSettings.getLanguage());
    }

    void testWifiManager(){
        print("\n==== Testing WifiManager===");
//        when(wifiManager.getConnectionInfo()).thenReturn("cnt-info-1234");
//        when(wifiManager.isClearpassWorking()).thenReturn(true);
        print(wifiManager.getConnectionInfo());
        print(String.valueOf(wifiManager.isClearpassWorking()));
    }
    void testCache(){
        print("\n==== Testing Cache===");
//        when((cache).empty()).thenReturn("Never empty");
//        when((cache).getContents()).thenReturn("got cached contents woo");
        print(cache.empty());
        print(cache.getContents());
    }
    void testImageResizer(){
        print("\n==== Testing ImageResizer===");
        imageResizer = new ImageResizer(cache);
        imageResizer.resize();
    }
    void testNetworkCache(){
        print("\n==== Testing NetworkCache===");
         networkCache = new NetworkCache(cache);
         networkCache.create();
    }
    void testNetworkManager(){
        print("\n==== Testing NetworkManager===");
        networkManager = new NetworkManager(wifiManager,networkCache);
        networkManager.connect();
    }

    void testFacebookApi(){
        print("\n==== Testing FacebookApi===");
        facebookApi = new FacebookApi( networkManager,  imageResizer,  userSettings);
        facebookApi.postImage("test post");
        facebookApi.postOnFacebook("my test message");
    }

    void print(String string){
        System.out.println(string);
    }

}
