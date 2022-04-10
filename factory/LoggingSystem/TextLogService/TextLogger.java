package LoggingSystem.TextLogService;

import LoggingSystem.core.LogServiceProvider;
import LoggingSystem.core.Logger;

public class TextLogger extends LogServiceProvider {
    @Override
    public Logger createLogService() {
        return new TextLoggerService();
    }
}
