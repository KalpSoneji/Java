package Runtime_Polymorphism2;

public class TestApp
{
	public static void main(String[] args) 
	{
		// Upcasting
		A objA = new B();
		
		objA.testA();

		// instanceof--operator
		if(objA instanceof B) {
			// Downcasting
			B objB = (B)objA;
			objB.testB();
		}
		
		else if(objA instanceof C) {
			// Downcasting
			C objC = (C)objA;
			objC.testC();
		}
	}
}