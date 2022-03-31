package com.company;

public class SavingsAccount extends Account{

    private int accountBalance = 0;

    public SavingsAccount(int customerDeposit){
        super(customerDeposit);
    }

    public String giveInterest(int interest){
        int five_percent_of_account_balance = (20 / getAccountBalance()) * 100;
        accountBalance += five_percent_of_account_balance;
        return "You were just given an interest of " + five_percent_of_account_balance + "your new account " +
                "balance is: " + accountBalance;
    }

    @Override
    public int getAccountBalance() {
        return accountBalance;
    }

}
