package LoggingSystem.DatabaseLogger;

import LoggingSystem.core.Logger;

public class DBLogger implements Logger {
    @Override
    public void logMessages(String messages) {
        System.out.println("Messages logged in db");
    }
}
