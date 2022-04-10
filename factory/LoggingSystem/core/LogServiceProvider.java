package LoggingSystem.core;

public abstract class LogServiceProvider {
    private final Logger messageLogger = createLogService();

    public abstract Logger createLogService();

    public void log(){
        messageLogger.logMessages();
    }
}
