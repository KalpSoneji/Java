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
	
	public Parameterized(Parameterized C1) //Copy Constructor
	{
		System.out.println("\nSTART --- Copy Constructor");
		System.out.println("Values before initialsing: " + this.rno + " " + this.name + " " + this.std);
	
		this.rno = C1.rno;
		this.name = C1.name;
		this.std = C1.std;
		
		System.out.println("Values after initialsing: " + this.rno + " " + this.name + " " + this.std);
		System.out.println("END --- Copy Constructor");
	}

	
	public static void main(String[] args) {
		
		Parameterized p1 = new Parameterized(1, "Kalp", 12);
		
		System.out.println(p1 + "\t" + p1.rno + "\t" + p1.name + "\t" + p1.std);
		
		Parameterized C1 = new Parameterized(p1); //Copy Constructor
		
		System.out.println(C1 + "\t" + C1.rno + "\t" + C1.name + "\t" + C1.std);

	}

}
