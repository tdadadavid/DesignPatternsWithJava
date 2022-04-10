package LoggingSystem;

import LoggingSystem.ExternalPartyLoggingService.ExternalLoggingAPI;

public class TransactionController extends ExternalLoggingAPI {
    public void debit(){
        // check if the amount requested is
        // greater than the amount in account
        // if there is an error log the error
        // for inspection

        log();

        // if there is no error debit the account
        // return a response containing the customer
        // current amount, amount withdrawn and bank
        // charges
    }
}
