package basic;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		System.out.println("Enter 1 for sum, 2 for difference, 3 for product and 4 for quotient: ");
		String choice = sc.next();
		
		switch(choice) {
			case "+":
				int sum = no1 + no2;
				System.out.println("Sum = " + sum);
				break;
			case "-":
				int diff = no1 - no2;
				System.out.println("Difference = " + diff);
				break;
			case "*":
				int prod = no1 * no2;
				System.out.println("Product = " + prod);
				break;
			case "/":
				int div = no1 / no2;
				System.out.println("Quotient = " + div);
				break;
			default:
				System.out.println("Enter valid choice.\n");
				break;
		}
		
		//to remove warning, add sc.close();
		sc.close();
		
	}
}
