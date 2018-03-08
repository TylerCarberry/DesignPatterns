package injection;

public class UserSettings {

    private String language = "English";// default is english

    public enum AlarmConfigLevel {
        NONE, RANDOM, LOW, MEDIUM, HIGH, EXTREME, ROBO
    }

    public UserSettings() {
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String configureAlarmNotificationLevel(AlarmConfigLevel level) {
        return level.toString();
    }
}
