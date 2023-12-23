package src2.abstruct_package;

public class TestAccount {
    public static void main(String[] args) {
        Account cAccount = new CheckingAccount( 677, 900, "hgf");
        Account sAccount= new SavingAccount( 766, 800, "hjk");

        cAccount.deposit( 65);
        sAccount.withdraw( 75);
        // deposit, withdraw is methods
    }

}
