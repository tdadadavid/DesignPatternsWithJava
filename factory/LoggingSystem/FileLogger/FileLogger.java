package LoggingSystem.FileLogger;

import LoggingSystem.core.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {

    @Override
    public void logMessages(String messages) throws IOException {

        try {
            File file = new File("fileLogger.txt");

            // if this file does not exist then create it
            if (file.createNewFile())
                System.out.println("new File created");

            FileWriter fileWriter = new FileWriter(file.getName(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(messages);
            bufferedWriter.close();

        }
        catch (IOException exception){
            exception.printStackTrace();
        }

        System.out.println("Messages logged to file");
    }
}
