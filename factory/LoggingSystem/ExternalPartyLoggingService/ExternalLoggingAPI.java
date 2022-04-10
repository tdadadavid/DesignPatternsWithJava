package LoggingSystem.ExternalPartyLoggingService;

import LoggingSystem.core.LogServiceProvider;
import LoggingSystem.core.Logger;

public class ExternalLoggingAPI extends LogServiceProvider {
    @Override
    public Logger createLogService() {
        return new ExternalLoggingService();
    }
}
