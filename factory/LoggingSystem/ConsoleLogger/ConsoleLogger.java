package LoggingSystem.ConsoleLogger;

import LoggingSystem.core.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void logMessages(String messages) {
        System.out.println("Messages logged on console: " + messages);
    }
}
