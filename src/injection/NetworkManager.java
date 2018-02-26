package injection;

public class NetworkManager {

    WifiManager wifiManager;
    NetworkCache networkCache;

    public NetworkManager(WifiManager wifiManager, NetworkCache networkCache) {
        this.wifiManager = wifiManager;
        this.networkCache = networkCache;
    }

    public WifiManager getWifiManager() {
        return wifiManager;
    }

    public void setWifiManager(WifiManager wifiManager) {
        this.wifiManager = wifiManager;
    }

    public NetworkCache getNetworkCache() {
        return networkCache;
    }

    public void setNetworkCache(NetworkCache networkCache) {
        this.networkCache = networkCache;
    }
}
