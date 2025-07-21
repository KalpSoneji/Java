package MutableString;

public class builder_buffer {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Kalp");
		System.out.println("Logical address before: " + sb.hashCode());
		
		sb.append(" Soneji");
		
		System.out.println("Logical address after: " + sb.hashCode());
		
		StringBuffer sb2 = new StringBuffer("Kalp");
		System.out.println("Logical address before: " + sb2.hashCode());
		
		sb2.append(" Soneji");
		
		System.out.println("Logical address after: " + sb2.hashCode());
		
//		StringBuffer is used when it is to be made thread-safe or during multi-threading.
//		StringBuilder isn't thread safe hence used in single-threading and its faster.

	}

}
