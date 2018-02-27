package injection;

public class ImageResizer {

    Cache cacheFile;

    public ImageResizer(Cache cacheFile) {
        this.cacheFile = cacheFile;
    }

    public void resize() {
        System.out.println("Resizing image");
    }
}
