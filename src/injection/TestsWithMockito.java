package injection;

import javax.inject.*;
import injection.dagger.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestsWithMockito {

    @Inject FacebookApi facebookApi;
    @Inject NetworkManager networkManager;
    @Inject ImageResizer imageResizer;
    @Inject NetworkCache networkCache;
    @Inject UserSettings userSettings;
    @Inject WifiManager wifiManager;
    @Inject Cache cache;


    public TestsWithMockito() {

        DaggerTestFacebookComponent.create().inject(this);

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
        print(userSettings.configureAlarmNotificationLevel(UserSettings.AlarmConfigLevel.NONE));
        print(userSettings.getLanguage());
    }

    void testWifiManager(){
        print("\n==== Testing WifiManager===");
        print(wifiManager.getConnectionInfo());
        print(String.valueOf(wifiManager.isClearpassWorking()));
    }

    void testCache(){
        print("\n==== Testing Cache===");
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
