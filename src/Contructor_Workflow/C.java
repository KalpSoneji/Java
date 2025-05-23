package Contructor_Workflow;

public class C extends B{

	int no3;
		
	public C() {
		System.out.println("C Default Constructor called");
		no3 = 30;
	}
		
	public void dispData() {
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
	}

	public static void main(String[] args) {
		
		C c = new C();
		
		c.dispData();
	}	

}
