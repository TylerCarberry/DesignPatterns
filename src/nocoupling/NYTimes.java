package nocoupling;

public class NYTimes {

    public NYTimes() {
    }

    public void writeArticle() {
        NewsSubject.get().publishToTopic();
    }
}
