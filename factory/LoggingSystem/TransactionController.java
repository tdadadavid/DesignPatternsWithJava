package LoggingSystem;

import LoggingSystem.ConsoleLogger.ConsoleLogger;
import LoggingSystem.DatabaseLogger.DBLogger;
import LoggingSystem.FileLogger.FileLogger;

import java.io.IOException;

public class TransactionController extends DBLogger {
    public void debit() throws IOException {
        // check if the amount requested is
        // greater than the amount in account
        // if there is an error log the error
        // for inspection

        logMessages("Error: User denied access to user's account balance page\t");

        // if there is no error debit the account
        // return a response containing the customer
        // current amount, amount withdrawn and bank
        // charges


    }

}
