package Inner_Class;

public class local {

	private int no = 5;
	
	void show() {
		
		class inner {
			void disp() {
				System.out.println("Number = " + no);
			}
		}
		
		inner inobj = new inner();
		inobj.disp();
	}
	
	public static void main(String[] args) {
		
		local loobj = new local();
		loobj.show();
		
	}
	
}
