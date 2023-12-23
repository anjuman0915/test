package bank_package;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount();
        bankAccount.balance = 5000;
        bankAccount.accountNumber= 123;
        bankAccount.phoneNumber= "2035209858";
        bankAccount.name= "Anjuman";

        bankAccount.deposit( 500);
        System.out.println(bankAccount.balance);

        //////

        bankAccount2 bankAccount2 = new bankAccount2();
        bankAccount2.setAccountNumber(456);

        bankAccount2.setBalance(-200);
        bankAccount2.setPhoneNumber("2035209858");
        System.out.println(bankAccount2.getBalance());
    }
}