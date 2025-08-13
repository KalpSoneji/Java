package Collection_List_Inner_Class;

public class anonymous_TestApp {

    public static void main(String[] args) {

        anonymous objA = new anonymous() {
            
        	@Override
            void add(int no1, int no2) {
                System.out.println("Sum = " + (no1 + no2));
            }
        	
        };

        objA.add(2, 3);
    }
}