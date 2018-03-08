package injection;

public class ImageResizer {

    private Cache cacheFile;

    public ImageResizer(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }

    public void resize() {
        System.out.println("Resizing image" );
    }
}
