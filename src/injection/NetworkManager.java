package injection;

public class NetworkManager {

    private WifiManager wifiManager;
    private NetworkCache networkCache;

    public NetworkManager(WifiManager wifiManager, NetworkCache networkCache) {
        this.wifiManager = wifiManager;
        this.networkCache = networkCache;
    }

    public void connect() {
        System.out.println("Is clearpass working? " + wifiManager.isClearpassWorking());
        networkCache.create();
    }
}
