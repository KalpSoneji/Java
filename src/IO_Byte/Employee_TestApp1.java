package IO_Byte;
import java.io.*;

public class Employee_TestApp1 {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("object2.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);

			Employee[] employees = (Employee[]) objin.readObject();

			System.out.println("Employee Data: \n");

			for (Employee emp : employees) 
				emp.dispData();  

			objin.close();
			fin.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}