package nocoupling;

public class CNN {

    public CNN() {
    }

    public void breakingNews(String headline) {
        NewsSubject.get().publishToTopic(new News(headline));
    }

}
