package labworks;

import java.util.*;

public class QueueS {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many strings you want to insert in Queue?");
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			q.add(scanner.next());
		}
		System.out.println(q);
		System.out.println(q.offer("test"));
		System.out.println(q.remove("a"));
		System.out.println(q.poll());
		System.out.println(q.peek());
	}	
}
