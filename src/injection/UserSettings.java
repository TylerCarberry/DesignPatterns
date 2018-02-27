package injection;

public class UserSettings {

  public enum AlarmConfigLevel {
    NONE,RANDOM,LOW,MEDIUM,HIGH,EXTREME, ROBO
  }
  public UserSettings() {
  }

  public String getLanguage() {
    return "English";
  }

  public String configureAlarmNotificationLevel(AlarmConfigLevel level){
      return level.toString();
  }
}
