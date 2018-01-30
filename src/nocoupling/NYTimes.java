package nocoupling;

public class NYTimes {

    public NYTimes() {
    }

    public void writeArticle(String headline) {
        NewsSubject.get().publishToTopic(new News(headline));
    }
}
