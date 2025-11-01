package OOP.AbstractionsAndInterface.Exampe;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {

    @Override
    public void log(String message) {
        String time = LocalDateTime.now().toString();
        System.out.println("[" + time + "] " + message);
    }
}
