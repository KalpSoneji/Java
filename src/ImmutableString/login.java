package ImmutableString;

import java.util.Scanner;

public class login {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		
		final String correct_Password = "AbCd1@3$";
		boolean flag = false;
		
		System.out.print("Enter your email ID: ");
		String email = sc.nextLine();
		
		for (int i = 0; i < email.length(); i++) 
			if (email.contains("@royalinstitute.com")) 
				System.out.println("Welcome " + email.substring(0, email.indexOf("@")) + '!');
		
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		
		if (password.equals(correct_Password)) 
			System.out.println("Successfull login!");
		else
			System.out.println("Incorrect password");
		
	}

}
