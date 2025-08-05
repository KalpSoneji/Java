package IO_Byte;

import java.io.*;

public class copy {

	public static void main(String[] args) {
		
		
		try {
			
			FileInputStream fin = new FileInputStream("/Users/kalpsoneji/Documents/Royal/Java/Morning_Java/first.txt");
			FileOutputStream fout = new FileOutputStream("second.txt");
			
			int temp;

			while((temp = fin.read()) != -1) {
				System.out.print((char)temp);
				fout.write(temp);
			}
			
			fout.close();
			fin.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
