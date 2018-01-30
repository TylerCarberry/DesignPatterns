package nocoupling;

public class Simulation {

    private CNN cnn;
    private NYTimes nyTimes;

    public Simulation() {
        cnn = new CNN();
        nyTimes = new NYTimes();
    }

    public void hurricane() {
        cnn.breakingNews("There is a hurricane");
    }

    public void carCrash() {
        nyTimes.writeArticle("There was a car crash");
    }

}
