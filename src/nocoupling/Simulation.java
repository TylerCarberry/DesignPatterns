package nocoupling;

public class Simulation {

    private CNN cnn;
    private NYTimes nyTimes;

    public Simulation() {
        cnn = new CNN();
        nyTimes = new NYTimes();
    }

    public void hurricane() {
        cnn.breakingNews();
    }

    public void carCrash() {
        nyTimes.writeArticle();
    }

}
