package IO_Byte;

import java.io.*;
import java.util.Scanner;

public class FileWrite {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter("third.txt");
			
			fw.write(name);
			fw.close();
			System.out.println("Success");
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}
}
