package labworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of strings you want to add in List");
		int n=scanner.nextInt();
		ArrayList<String> arrayList=new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			arrayList.add(scanner.next());
		}
		System.out.println("ArrayList before implementing Comparable Function (Sort)");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println("ArrayList after implementing Comparable Function (Sort)");
		System.out.println(arrayList);
		
	}

}
