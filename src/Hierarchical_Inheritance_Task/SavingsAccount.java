package Hierarchical_Inheritance_Task;

public class SavingsAccount extends BankAccount{

	private double interestRate;

    SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned in 1 year: ₹" + interest);
    }
	
}
