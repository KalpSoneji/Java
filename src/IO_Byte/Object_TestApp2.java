package IO_Byte;

import java.io.*;

public class Object_TestApp2 {

	public static void main(String[] args) {

		try {
		
			FileInputStream fin = new FileInputStream("/Users/kalpsoneji/Documents/Royal/Java/Morning_Java/object.txt");
			
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			Object o = (Object)objin.readObject();
			
			o.dispData();
			
			objin.close();
			fin.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
