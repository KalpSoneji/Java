package ExceptionHandling;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			String name = null;
			System.out.println(name.charAt(0));
			System.out.println(1/0);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
