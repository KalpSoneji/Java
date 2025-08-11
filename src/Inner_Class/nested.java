package Inner_Class;

public class nested {

	private static int no = 5;
	
	static class inner {
		void disp() {
			System.out.println("Number = " + no);
		}
	}
	
	public static void main(String[] args) {
		
		nested.inner obj = new nested.inner();
		obj.disp();
		
	}
 	
}
