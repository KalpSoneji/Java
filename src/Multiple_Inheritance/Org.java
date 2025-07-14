package Multiple_Inheritance;

public class Org implements Person {

	@Override
	public void getBehave() {
		System.out.println("Employee : Employee Behaviour");
	}

	public void getSalary() {
		System.out.println("Org---Employee---getSalary()");
	}
}
