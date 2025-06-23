package Hierarchical_Inheritance_Task;

public class FixedDepositAccount extends BankAccount{

	private int maturityPeriod;

    FixedDepositAccount(int accountNumber, String accountHolderName, double balance, int maturityPeriod) {
        super(accountNumber, accountHolderName, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void calculateMaturityAmount() {
        double rate = 6.5; 
        double maturityAmount = balance * Math.pow((1 + rate / 100), maturityPeriod);
        System.out.println("Maturity Amount after " + maturityPeriod + " year(s): ₹" + String.format("%f", maturityAmount));
    }
	
}
