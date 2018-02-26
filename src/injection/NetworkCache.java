package injection;

public class NetworkCache {

    Cache cacheFile;

    public NetworkCache(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }

    public Cache getCacheFile() {
        return cacheFile;
    }

    public void setCacheFile(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }
}
