package nocoupling;

public class News {

    private String headline;

    public News() {
    }

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        return headline != null ? headline.equals(news.headline) : news.headline == null;
    }

    @Override
    public int hashCode() {
        return headline != null ? headline.hashCode() : 0;
    }
}
