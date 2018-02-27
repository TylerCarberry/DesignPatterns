package injection;

public class FacebookApi {

    NetworkManager networkManager;
    ImageResizer imageResizer;
    UserSettings userSettings;

    public FacebookApi(NetworkManager networkManager, ImageResizer imageResizer) {
        this.networkManager = networkManager;
        this.imageResizer = imageResizer;
    }

    public void postOnFacebook() {
        if (userSettings.getLanguage().equalsIgnoreCase("English")) {
            System.out.println("Having a great time in OOD!");
        } else {
            System.out.println("Hola!");
        }
    }

    public void postImage(String imageUrl) {
        networkManager.connect();
        imageResizer.resize();
        System.out.println("Posted image");
    }
}
