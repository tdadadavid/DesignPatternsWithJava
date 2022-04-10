package LoggingSystem.core;

import java.io.IOException;
import java.util.Properties;

public abstract class LogServiceProvider {
    private final Logger messageLogger = createLogService();

    public abstract Logger createLogService();

    public void log(String messages) throws IOException {
        messageLogger.logMessages(messages);
    }



}
