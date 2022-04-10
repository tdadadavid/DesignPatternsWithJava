package LoggingSystem.ArrayLoggingService;

import LoggingSystem.core.LogServiceProvider;
import LoggingSystem.core.Logger;

public class ArrayLogger extends LogServiceProvider {
    @Override
    public Logger createLogService() {
        return new ArrayLoggingService();
    }
}
