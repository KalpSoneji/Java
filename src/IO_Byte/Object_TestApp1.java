package IO_Byte;

import java.io.*;

public class Object_TestApp1 {

	public static void main(String[] args) {

		Object o = new Object(1, "Kalp", 12);
		
		try {
			
			FileOutputStream fout = new FileOutputStream("object.txt");
			
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			
			objout.writeObject(o);
			
			objout.close();
			fout.close();
			
			System.out.println("Success");
		}
		
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
