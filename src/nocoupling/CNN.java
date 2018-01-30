package nocoupling;

public class CNN {

    public CNN() {
    }

    public void breakingNews() {
        NewsSubject.get().publishToTopic();
    }

}
