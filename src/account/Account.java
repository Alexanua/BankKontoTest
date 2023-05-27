package account;

public class Account {
    private int balance;
    private final String accountNr;



    public  Account(int initialCash, String accountNr) {

        this.balance = initialCash;
        this.accountNr = accountNr;

    }

    public boolean deposit(int cash) {
        if(cash < 0) {
            System.out.println("Deposit cash can't be negative.");
            return false;
        }
        balance += cash;
        return true;
    }

    public boolean withdraw(int cash) {
        if(cash < 0) {
            System.out.println("Withdraw cash can't be negative.");
            return false;
        }
        if(cash > balance) {
            System.out.println("Not enough balance to withdraw cash.");
            return false;
        }
        balance -= cash;
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNr() {
        return accountNr;
    }
}
