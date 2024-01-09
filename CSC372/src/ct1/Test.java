package ct1;

public class Test {
	public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setFirstName("Ben");
        bankAccount.setLastName("Lau");
        bankAccount.setAccountID(123456);
        bankAccount.deposit(1000);
        bankAccount.withdrawal(200);

        System.out.println("Bank Account Summary");
        bankAccount.accountSummary();
        
        System.out.println();
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Ben");
        checkingAccount.setLastName("Lau");
        checkingAccount.setAccountID(654321);
        checkingAccount.setInterestRate(1.3);
        checkingAccount.deposit(100);
        checkingAccount.processWithdrawal(200);

        System.out.println();
        System.out.println("Checking Account Summary");
        checkingAccount.accountSummary();
    }
}
