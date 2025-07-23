package ExceptionHandling;

import Exceptions.StringIndexOutOfBounds;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		
		try {
			String name = null;
			System.out.println(name.charAt(name.length()));
		}
		
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Exception handled.");
		}

	}

}
