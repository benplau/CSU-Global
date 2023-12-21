package CT1;

public class CheckingAccount extends BankAccount {
	private double interestRate;

    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void processWithdrawal(double amount) {
        if (getBalance() >= amount) {
            withdrawal(amount);
        } else {
            System.out.println("Overdraft fee ($30) has been accessed.");
            System.out.println("Checking acccound balance: -$" + (amount + 30 - getBalance()));
        }
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}
