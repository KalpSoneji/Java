package abstract_keyword;

public class PublicPlace extends Person {
	
	@Override
	public void getBehave() {
		System.out.println("Public Place : Human Behaviour");
	}
	
	public void roamAround() {
		System.out.println("Public Place---Human---roamAround()");
	}	

}