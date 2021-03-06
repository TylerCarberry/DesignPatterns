package injection;

public class FacebookApi {

    private NetworkManager networkManager;
    private ImageResizer imageResizer;
    private UserSettings userSettings;

    public FacebookApi(NetworkManager networkManager, ImageResizer imageResizer, UserSettings userSettings) {
        this.networkManager = networkManager;
        this.imageResizer = imageResizer;
        this.userSettings = userSettings;
    }

    public void postOnFacebook(String message) {
        networkManager.connect();

        if (userSettings.getLanguage().equalsIgnoreCase("English")) {
            System.out.println(message);
        } else {
            System.out.println("language is = " + userSettings.getLanguage());
            System.out.println(message);
        }
    }

    public void postImage(String imageUrl) {
        imageResizer.resize();
        System.out.println("Posted image: " + imageUrl);
    }

    public NetworkManager getNetworkManager() {
        return networkManager;
    }

    public void postRandomCat() {
        imageResizer.resize();
        System.out.println("Posted image: http://thecatapi.com/?id=" + (int) Math.floor(Math.random() * 1000));
    }
}
