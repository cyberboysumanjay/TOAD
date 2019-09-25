package labworks;

import java.util.LinkedList;
import java.util.Scanner;

public class LL {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of LinkedList");
		int l=scanner.nextInt();
		System.out.println("Enter the First Node");
		ll.addFirst(scanner.next());
		
		System.out.println("Enter the Nodes");
		for (int i = 0; i < l-1; ++i) {
			ll.addLast(scanner.next());
		}
		
		System.out.println("Final LinkedList is "+ll);
		System.out.println("First element of LinkedList is: "+ll.getFirst());
		System.out.println("Last element of LinkedList is:"+ll.getLast() );
		System.out.println("Element at Index 1 is "+ll.get(1));
		System.out.println("Last Index of 'a' is "+ll.lastIndexOf("a"));
		System.out.println("Removed Head of LinkedList using Poll is "+ll.poll());
		System.out.println("Removed Head of LinkedList using Poll First is "+ ll.pollFirst());
		System.out.println("Removed Head of LinkedList using Poll Last is "+ ll.pollLast());
		System.out.println("Removed First element using RemoveFirst "+ll.removeFirst());
		System.out.println("Removed Last element using RemoveLast "+ll.removeLast());
		System.out.println("Removed First occurance of 'd' "+ll.removeFirstOccurrence('d'));
		System.out.println("Removed Last 'e' "+ll.removeLastOccurrence('e'));
		System.out.println("Print LinkedList "+ll);	
		
	}

}
