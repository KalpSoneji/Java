package ExceptionHandling;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no1, no2, ans;
		
		System.out.print("Enter 2 numbers: ");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
				
		try {
			ans = no1/ no2;	
		} 
		
		catch(ArithmeticException e) {
			ans = 0;
			e.printStackTrace();
			System.out.println("Exception handled.\n" + ans);
		}
		
		sc.close();

	}

}
