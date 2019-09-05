package labworks;

import java.util.Scanner;
import java.util.Vector;

public class VectorS {
	public static void main(String[] args) {
		Vector vector=new Vector();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many elements to add in vector?");
		int n=scanner.nextInt();
		for (int i = 0; i <n; i++) {
			vector.add(scanner.next());
		}
		System.out.println(vector);
		System.out.println(vector.capacity());
		System.out.println(vector.contains(8));
		System.out.println(vector.isEmpty());
		System.out.println(vector.elementAt(0));
		vector.removeAllElements();
		System.out.println(vector.isEmpty());
		vector.setSize(2);
		System.out.println(vector);
		
	}
}
