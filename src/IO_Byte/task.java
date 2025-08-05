package IO_Byte;

import java.io.*;

public class task {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("/Users/kalpsoneji/Documents/Royal/Java/Morning_Java/second.txt");
			FileWriter fw = new FileWriter("/Users/kalpsoneji/Documents/Royal/Java/Morning_Java/third.txt");

			int temp;

			while ((temp = fr.read()) != -1) {
				fw.append((char) temp);  
			}

			fr.close();  
			fw.close();  

			System.out.println("File copied successfully to third.txt");
		} 
		
		catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}