package Multiple_Inheritance;

public class School implements Person {

	@Override
	public void getBehave() {
		System.out.println("School : Student Behaviour");
	}

	public void getResult() {
		System.out.println("School---Student---getResut()");
	}
}
