package InvalidAgeException;

import java.util.Scanner;

// throw--checked exception
// throws----declare checked exception

public class TestApp1 {

	public static void isValidAgeForVote(int age) //throws InvalidAgeException 
	{
		if(age < 18) 
			throw new InvalidAgeException("\n\t\"Invalid Age,\n\t\tPlease enter valid Age\"");
			// raise checked--exception
		else 
			System.out.println("Welcome for Vote ");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age for Vote :  ");
		int age = sc.nextInt();
		
		try {
			isValidAgeForVote(age);
		}
			
		catch (InvalidAgeException e) { 
			e.printStackTrace();
		}
		
		System.out.println("General Stateement");
	}
}

/* 		// nested try..catch

1. nested try...catch
2. finally block
3. throw
4. throws
5. custom exception[user Defined Exception]
6. method overridding with exception
*/