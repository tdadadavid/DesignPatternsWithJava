package src.com.company;

public class Encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(200);
        account.withdraw(150);
        System.out.println(account.getBalance());
    }
}
