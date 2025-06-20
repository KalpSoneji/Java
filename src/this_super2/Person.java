package this_super2;

public class Person {

	String name;
	
	public Person() {
		System.out.println("Person - Def Con");
	}
	
	public Person(String name) {
		
		System.out.println("Person - Para Con");
		this.name = name;
		
	}
	
}
