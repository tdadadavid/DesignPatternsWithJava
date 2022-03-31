package com.company;

public class CheckingAccount extends Account {

    private int serviceFee = 10;
    private int accountBalance = 0;


    public CheckingAccount(int customerDeposits) {
        super(customerDeposits);
    }


    public String withdraw(int Amount_To_Withdraw){
        System.out.println("Successfully withdrawn " + Amount_To_Withdraw);
        accountBalance -= (Amount_To_Withdraw + serviceFee);
        return "Your current balance: " + accountBalance;
    }

    @Override
    public int getAccountBalance() {
        return accountBalance;
    }

}
