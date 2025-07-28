package ExceptionHandling;

import java.util.Scanner;

public class Nested_try_catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int ans = 0;
		
		try {
			
			try {
				ans = no1 / no2;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				String name = null;
				System.out.println("Name length = " + name.length());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				String name1 = "Royal";
				System.out.println(name1.charAt(name1.length()));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
		catch(Exception e) {
			ans = 0;
			e.printStackTrace();
		}
		
		System.out.println("Answer = " + ans);
		
	}

}
