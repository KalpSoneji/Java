package construtor;

public class TestApp1 {

	public static void main(String[] args) {

		System.out.println("START : Main Method");
		
		Student sobj = new Student();
		
		System.out.println(sobj.getrno() + " " + sobj.getname() + " " + sobj.getstd());
		
		System.out.println("EXIT : Main Method");

	}

}
