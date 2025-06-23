package Hierarchical_Inheritance_Task;

import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Bank Account System");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Balance: ₹");
        double balance = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.print("Enter Interest Rate (%): ");
                double rate = sc.nextDouble();
                SavingsAccount sa = new SavingsAccount(accNo, name, balance, rate);
                sa.displayAccountDetails();
                sa.calculateInterest();
                break;

            case 2:
                System.out.print("Enter Overdraft Limit: ₹");
                double limit = sc.nextDouble();
                CurrentAccount ca = new CurrentAccount(accNo, name, balance, limit);
                ca.displayAccountDetails();
                ca.checkOverdraftEligibility();
                break;

            case 3:
                System.out.print("Enter Maturity Period (in years): ");
                int years = sc.nextInt();
                FixedDepositAccount fda = new FixedDepositAccount(accNo, name, balance, years);
                fda.displayAccountDetails();
                fda.calculateMaturityAmount();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}