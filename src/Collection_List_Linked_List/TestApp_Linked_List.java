package Collection_List_Linked_List;

import java.util.*;

public class TestApp_Linked_List {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Kalp");
		list.add("Vidhi");
		list.add("Hash");
		
		Iterator <String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
	}

}
