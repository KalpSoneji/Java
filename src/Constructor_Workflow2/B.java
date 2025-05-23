package Constructor_Workflow2;

public class B extends A{

		int no2;
		
		public B(int no1, int no2) {
			
			super(no1);
			System.out.println("B parameterized Constructor called");
			this.no2 = no2;
			
		}

}
