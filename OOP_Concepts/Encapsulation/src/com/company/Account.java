package src.com.company;

public class Account {
    private int balance;

    public void withdraw(int amount){
        // validate the amount given
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public void deposit(int amount){
        if (amount > 0)
            balance += amount;
    }

    public int getBalance(){
        return balance;
    }
}
