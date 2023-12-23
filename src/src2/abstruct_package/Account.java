package src2.abstruct_package;

public abstract class Account {
    private int accountNo;
    private double balance;
    private String name;

    Account(int accountNo, double balance, String name) {
        this.accountNo= accountNo;
        this.name=name;
        this.balance=balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

}
