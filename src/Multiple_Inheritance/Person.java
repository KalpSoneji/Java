package Multiple_Inheritance;

public interface Person {

	public static final int No = 10; // public static final

	public abstract void getBehave(); // public abstract

	static void testStatic() {
		System.out.println("static method --- teststatic()");
	}

	default void testdefault() {
				System.out.println("Default Method -- testDefault()");
				testPrivate();
				testPrivate();
			}

	private void testPrivate() {
		System.out.println("Private Method -- testPrivate()");
	}
}
