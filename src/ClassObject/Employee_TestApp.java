package ClassObject;

public class Employee_TestApp {

	public static void main(String[] args) {

		Employee e[] = new Employee[5];
		
		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee();
			e[i].scanData();
		}

		for (int i = 0; i < e.length; i++) {
			e[i].dispData();
		}
	}

}
