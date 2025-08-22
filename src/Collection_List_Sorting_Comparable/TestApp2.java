package Collection_List_Sorting_Comparable;

import java.util.*;

public class TestApp2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("rahul");
		list.add("ankur");
		list.add("sagar");
		list.add("krunal");
		list.add("rakesh");
		list.add("ajay");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		System.out.println("------------------------");

		// Sorting
		Collections.sort(list);

		itr = list.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
}