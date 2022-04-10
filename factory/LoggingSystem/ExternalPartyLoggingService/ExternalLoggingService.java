package LoggingSystem.ExternalPartyLoggingService;

import LoggingSystem.core.Logger;

public class ExternalLoggingService implements Logger {
    @Override
    public void logMessages() {
        System.out.println("Messages logged via an external API");
    }
}
