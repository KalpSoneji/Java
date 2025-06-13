package Constructor;

public class Parameterized {

	int rno, std;
	String name;
	
	public Parameterized(int rno, String name, int std) {
		
		System.out.println("START --- Parameterized Constructor");
		System.out.println("Values before initialsing: " + this.rno +"\t" + this.name + "\t" + this.std);
				
		this.rno = rno;
		this.name = name;
		this.std = std;
		
		System.out.println("Values after initialsing: " + this.rno +"\t" + this.name + "\t" + this.std);
		System.out.println("END --- Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		Parameterized p1 = new Parameterized(1, "Kalp", 12);
		
		System.out.println(p1 + "\t" + p1.rno + "\t" + p1.name + "\t" + p1.std);

	}

}
