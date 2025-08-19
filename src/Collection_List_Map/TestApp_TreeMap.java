package Collection_List_Map;

import java.util.*;

public class TestApp_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(10, "Kalp");
		map.put(2, "Vidhi");
		map.put(35, "Hash");
		
		for( Map.Entry<Integer, String> e : map.entrySet())
			System.out.println(e.getKey() + " - " + e.getValue());

	}

}
