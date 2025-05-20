package OOPS;

public class TestApp2 {

	public static void main(String[] args) {

		Class_Object2 s[] = new Class_Object2[5];
		
		System.out.println("s.length = " + s.length);
		
		for(int i=0; i<s.length; i++) {
			s[i] = new Class_Object2();
			s[i].scanData();
		}
		
		for(int i=0; i<s.length; i++)
			s[i].dispData();

	}

}
