package Hierarchical_Inheritance_Task;

public class CurrentAccount extends BankAccount{

	private double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraftEligibility() {
    	
        if (balance < 0 && Math.abs(balance) <= overdraftLimit) //googled the condition 
            System.out.println("Eligible for overdraft facility.");
        else if (balance >= 0) 
            System.out.println("No overdraft used."); 
        else 
            System.out.println("Overdraft limit exceeded!");
        
    }
	
}
