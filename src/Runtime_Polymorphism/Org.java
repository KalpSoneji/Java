package Runtime_Polymorphism;

public class Org extends Person{
		
		@Override
		public void getBehave() {
			System.out.println("Employee : Employee Behaviour");
		}	
		
		public void getSalary() {
			System.out.println("Org---Employee---getSalary()");
		}	
		
}