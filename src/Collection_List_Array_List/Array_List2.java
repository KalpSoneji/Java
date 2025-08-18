package Collection_List_Array_List;

import java.util.*;

public class Array_List2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kalp");
		list.add("Hash");
		list.add("Vidhi");
		list.add("Vatsal");
		list.add("Jenil");
		
		list.remove("Hash");
		list.remove(3);
		
		list.set(1, "Aryan");
		
		Iterator<String> itr = list.iterator();

		while(itr.hasNext()) {
			
			String name = itr.next();
			System.out.println(name);
			
		}
		
	}

}
