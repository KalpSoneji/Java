package abstract_keyword;

public class Org extends Person {
	
	@Override
	public void getBehave() {
		System.out.println("Org : Employee Behaviour");
	}
	
	public void getSalary() {
		System.out.println("Org---Employee---getSalary()");
	}	

}