package labworks;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQ {
	public static void main(String[] args) {
		PriorityQueue< String> priorityQueue=new PriorityQueue<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many strings you want to enter?");
		int n= scanner.nextInt();
		for (int i = 0; i < n; i++) {
			priorityQueue.add(scanner.next());
		}
		System.out.println(priorityQueue.offer("Android"));
		System.out.println(priorityQueue.remove("Java"));
		System.out.println(priorityQueue);
		priorityQueue.clear();
		System.out.println(priorityQueue);
		Object[] aObject=priorityQueue.toArray();
		for (int i = 0; i < aObject.length; i++) {
			System.out.println(aObject[i]);
		}
	}
}
