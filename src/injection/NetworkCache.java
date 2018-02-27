package injection;

public class NetworkCache {

    Cache cacheFile;

    public NetworkCache(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }

    public void create() {
        System.out.println("Creating cache, contents of cache: " + cacheFile.getContents());
    }
}
