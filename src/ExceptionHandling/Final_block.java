package ExceptionHandling;

import java.util.Scanner;

public class Final_block {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int ans;
		
		try {
			ans = no1 / no2;
		}
		catch(ArithmeticException e) {
			ans = 0;
			e.printStackTrace();
		}
		finally {
			System.out.println("Final block");
		}
		
		System.out.println("Answer = " + ans);
		
	}
}
