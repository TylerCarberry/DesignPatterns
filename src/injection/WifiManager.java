package injection;

import java.util.Random;
import java.util.UUID;

public class WifiManager {

    static final String codeSuff = "-RoboFireAlarmNetwork-STATUS-ALERT#";

    public String getConnectionInfo(){
        return UUID.randomUUID().toString()+codeSuff+UUID.randomUUID().toString();
    }

    public boolean isClearpassWorking() {
        return new Random().nextFloat() > 0.9f;
    }
}
