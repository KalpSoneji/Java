package IO_Byte;

import java.io.FileInputStream;

public class read {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer ();
		
		try {
			
			FileInputStream fin = new FileInputStream("/Users/kalpsoneji/Documents/Royal/Java/Morning_Java/first.txt");
			
			int temp;
			
			while ( (temp = fin.read()) != -1) 
				sb.append((char)temp);
			
			fin.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Final string : " + sb.toString());

	}

}
