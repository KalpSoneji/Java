package OOPS;

public class Encapsulation_TestApp {

	public static void main(String[] args) {

		Encapsulation e1 = new Encapsulation();
		
		e1.setrno(1);
		e1.setname("Kalp");
		e1.setstd(12);
		
		System.out.println(e1.getrno() + "\t" + e1.getname() + "\t" + e1.getstd());

	}

}
