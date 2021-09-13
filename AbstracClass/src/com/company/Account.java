package com.company;

public abstract class Account {

    private int deposit;

    public Account(int customerDeposits){
        this.deposit = customerDeposits;
    }
    public abstract int getAccountBalance();
}
