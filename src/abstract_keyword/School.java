package abstract_keyword;

public class School extends Person {
		
		@Override
		public void getBehave() {
			System.out.println("School : Student Behaviour");
		}
		
		public void getResult() {
			System.out.println("School---Student---getResult()");
		}	

}