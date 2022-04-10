package LoggingSystem.TextLogService;

import LoggingSystem.core.Logger;

public class TextLoggerService implements Logger {
    @Override
    public void logMessages() {
        System.out.println("Messages logged via text document");
    }
}
