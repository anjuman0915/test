package src2.abstruct_package;

public class CheckingAccount extends Account {
    CheckingAccount(int accountNo, double balance, String name) {
        super(accountNo, balance, name);
    }

    @Override
    public void withdraw(double amount) {




    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing "+amount+" to checking account");

    }
}




