package src2.abstruct_package;

public class SavingAccount extends Account {
    SavingAccount(int accountNo, double balance, String name) {
        super(accountNo, balance, name);
    }
    //8:22pm

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing "+amount+"from saving account");

    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing "+amount+" to checking account");

    }
}
