package Collection_List_Queue;

import java.util.PriorityQueue;

public class TestApp1 {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("Kalp");
		queue.add("Vidhi");
		queue.add("Kalp");
		queue.add("Hash");
		queue.add("Jenil");
		
		while(!queue.isEmpty())
			System.out.println(queue.poll());

	}

}
