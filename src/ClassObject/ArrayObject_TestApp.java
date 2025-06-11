package ClassObject;

public class ArrayObject_TestApp{

	public static void main(String[] args) {
		
		Array_Object s[] = new Array_Object[5];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = new Array_Object();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) {
			s[i].dispData();
		}
		
	}
	
}
