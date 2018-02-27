package injection;

public class ImageResizer {

    Cache cacheFile;

    public ImageResizer(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }

    public Cache getCacheFile() {
        return cacheFile;
    }

    public void setCacheFile(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }

    public void resize() {
        System.out.println("Resizing image");
    }
}
