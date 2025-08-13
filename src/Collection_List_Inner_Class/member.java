package Collection_List_Inner_Class;

public class member {
	
	private int no = 5;
	
	class inner{
		
		void disp() {
			System.out.println("No = " + no);
		}
		
	}
	
	public static void main(String[] args) {
		
		member objA = new member();
		
		member.inner objB = objA.new inner();
		
		objB.disp();
		
	}
	
}
