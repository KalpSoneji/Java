package construtor;

public class TestApp2 {

	public static void main(String[] args) {
		
		System.out.println("START : Main Method");
		
		Student sobj = new Student(1, "Kalp", 12);
		
		System.out.println(sobj.getrno() + " " + sobj.getname() + " " + sobj.getstd());
		
		Student sobj2 = new Student(sobj);
		
		System.out.println(sobj2.getrno() + " " + sobj2.getname() + " " + sobj2.getstd());
		
		System.out.println("EXIT : Main Method");
		
		Student sobj3 = new Student(1, "Kalp");
		
		System.out.println(sobj3.getrno() + " " + sobj3.getname());

	}

}
