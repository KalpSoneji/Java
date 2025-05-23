package Constructor_Workflow2;

public class C extends B{

	int no3;
		
	public C(int no1, int no2, int no3) {
		
		super(no1, no2);
		System.out.println("C parameterized Constructor called");
		this.no3 = no3;
	}
		
	public void dispData() {
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
	}

	public static void main(String[] args) {
		
		C c = new C(100, 200, 300);
		
		c.dispData();
	}	

}
