package IO_Byte;

import java.io.FileOutputStream;
import java.util.Scanner;

public class write {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		byte[] b = name.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("first.txt");
			
			fout.write(b);
			
			fout.close();
			
			System.out.println("Success");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();

	}

}
