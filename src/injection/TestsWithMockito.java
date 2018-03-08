package injection;

import injection.dagger.DaggerTestFacebookComponent;

import javax.inject.Inject;

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
    }

    public void runTests() {
        print("\n================ Running Mockito TestsWithMockito for FacebookApi =============");
        testUserSettings();
        testWifiManager();
        testCache();
        testImageResizer();
        testNetworkCache();
        testNetworkManager();
        testFacebookApi();
    }

    private void testUserSettings() {
        print("\n==== Testing UserSettings===");
        print(userSettings.configureAlarmNotificationLevel(UserSettings.AlarmConfigLevel.NONE));
        print(userSettings.getLanguage());
    }

    private void testWifiManager() {
        print("\n==== Testing WifiManager===");
        print(wifiManager.getConnectionInfo());
        print(String.valueOf(wifiManager.isClearpassWorking()));
    }

    private void testCache() {
        print("\n==== Testing Cache===");
        print(cache.empty());
        print(cache.getContents());
    }

    private void testImageResizer() {
        print("\n==== Testing ImageResizer===");
        imageResizer = new ImageResizer(cache);
        imageResizer.resize();
    }

    private void testNetworkCache() {
        print("\n==== Testing NetworkCache===");
        networkCache = new NetworkCache(cache);
        networkCache.create();
    }

    private void testNetworkManager() {
        print("\n==== Testing NetworkManager===");
        networkManager = new NetworkManager(wifiManager, networkCache);
        networkManager.connect();
    }

    private void testFacebookApi() {
        print("\n==== Testing FacebookApi===");
        facebookApi = new FacebookApi(networkManager, imageResizer, userSettings);
        facebookApi.postImage("test post");
        facebookApi.postOnFacebook("my test message");
    }

    private void print(String string) {
        System.out.println(string);
    }
}
