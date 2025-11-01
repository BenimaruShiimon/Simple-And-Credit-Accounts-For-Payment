package OOP.AbstractionsAndInterface.Exampe;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int count;
    @Override
    public void log(String message) {
        count++;
        String time = LocalDateTime.now().toString();
        String info = "INFO";

        if (message.toLowerCase().contains("ERROR")) {
            info = "ERROR";
        }
        System.out.println(info + " # " + count + "[ " + time + "] " + message);
    }
}
