package IO_Character;

import java.io.*;

public class FileRead {
	public static void main(String[] args) {
	
		try {
			
			FileReader fr = new FileReader("/Users/kalpsoneji/Documents/Royal/Java/Morning_Java/third.txt");
			
			int temp;
			
			while((temp = fr.read()) != -1)
				System.out.print((char)temp);
			
			fr.close();
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
