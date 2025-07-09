package abstract_keyword;

public class Home extends Person {
	
	@Override
	public void getBehave() {
		System.out.println("Home : Son Behaviour");
	}
	
	public void goPlay() {
		System.out.println("Home---Son---goPlay()");
	}	

}