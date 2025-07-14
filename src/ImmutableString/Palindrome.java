package ImmutableString;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String name;
		int i, j;
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		
		name = sc.nextLine();
		
		for( i = 0, j = (name.length() - 1); i < name.length(); i++, j--) {
			
			if(name.charAt(i) != name.charAt(j)) {
				flag = false;
				break;
			}
			
		}
		
		if(flag)
			System.out.println(name + " is palindrome.");
		else
			System.out.println(name + " is not palindrome.");
		
		sc.close();

	}

}
