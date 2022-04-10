package LoggingSystem.ArrayLoggingService;

import LoggingSystem.core.Logger;

public class ArrayLoggingService implements Logger {
    @Override
    public void logMessages() {
        System.out.println("Message logged via Array");
    }
}
