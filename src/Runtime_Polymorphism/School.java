package Runtime_Polymorphism;

public class School extends Person {
		
		@Override
		public void getBehave() {
			System.out.println("School : Student Behaviour");
		}
		
		public void getResult() {
			System.out.println("School---Student---getResult()");
		}	

}