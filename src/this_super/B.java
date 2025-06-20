package this_super;

public class B extends A{

	int no2;
	
	public B() {
	
		super(1000);
		System.out.println("B - Default Constructor");
		no2 = 200;
		
	}
	
	public B(int no2) {
		
		this();
		System.out.println("B - Para Constructor");
		this.no2 = no2;
		
	}
	
}
