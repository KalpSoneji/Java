package final_keyword;

public class A {
	
	//1. assign--Dm's
	final int no; // = 10;
	
	//2. Default Constructor
	A()
	{
		no = 100;
	}
	
	//3. arg. Constructor
	A(int no)
	{
		this.no = no;
	}
	
	public static void main(String[] args) {
		A obj = new A(200);
		
		System.out.println("obj.no = " + obj.no);
		
//-------Local Variable-------
		final int no;
		no = 10;
		//no = 100; C.E
		System.out.println(no);
	}
}