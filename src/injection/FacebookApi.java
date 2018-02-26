package injection;

public class FacebookApi {

    NetworkManager networkManager;
    ImageResizer imageResizer;

    public FacebookApi(NetworkManager networkManager, ImageResizer imageResizer) {
        this.networkManager = networkManager;
        this.imageResizer = imageResizer;
    }

    public NetworkManager getNetworkManager() {
        return networkManager;
    }

    public void setNetworkManager(NetworkManager networkManager) {
        this.networkManager = networkManager;
    }

    public ImageResizer getImageResizer() {
        return imageResizer;
    }

    public void setImageResizer(ImageResizer imageResizer) {
        this.imageResizer = imageResizer;
    }
}
