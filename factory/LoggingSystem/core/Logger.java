package LoggingSystem.core;

import java.io.IOException;

public interface Logger {
    void logMessages(String messages) throws IOException;
}
