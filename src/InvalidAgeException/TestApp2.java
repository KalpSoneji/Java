
package InvalidAgeException;

import java.io.IOException;
import java.util.Scanner;

// throw--checked declare
//throws--declare checked expection
public class TestApp2 {

	public static void isValidAgeForVote(int age) throws IOException 
	{

		if (age < 18) {
			throw new IOException("\nInvalid Age,\n\tPls enter valid Age");
		} else {
			System.out.println("Welcome for Vote");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();

		try {
			isValidAgeForVote(age);
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("General Statement");
	}
}
