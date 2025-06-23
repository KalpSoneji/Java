package Hierarchical_Inheritance_Task;

public class BankAccount {

	int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : ₹" + balance);
    }
	
}
