package Constructor;

public class Default {

	int rno, std;
	String name;
	
	public Default() {
		System.out.println("START --- Default Constructor");
		System.out.println("Values before initialsing: " + rno +"\t" + name + "\t" + std);
		
		rno = 1;
		name = "Kalp"; // Initializing values using constructor
		std = 12;
		
		System.out.println("Values after initialsing: " + rno +"\t" + name + "\t" + std);
		System.out.println("END --- Default Constructor");
	}
	
	public static void main(String[] args) {
		
		Default s1 = new Default();
		Default s2 = new Default();
		
		System.out.println(s1 + "\t" + s1.rno + "\t" + s1.name + "\t" + s1.std);
		System.out.println(s2 + "\t" + s2.rno + "\t" + s2.name + "\t" + s2.std);

	}

}