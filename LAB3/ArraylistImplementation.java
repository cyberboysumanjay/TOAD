package labworks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistImplementation {
	public static void main(String[] args) {
		ArrayList<String> List1=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		for (int i = 0; i <= n; i++) {
			String string=scanner.nextLine();
			List1.add(string);
		}
		//List1.add("CSE");
		//List1.add("ECE");
		//List1.add("EEE");
		System.out.println("Printing List after Adding data in List");
		printed(List1);
		List1.remove(2);
		System.out.println("Removed element at index 2");
		printed(List1);
		List1.add("EEE");
		List1.set(2, "Mechanical");
		System.out.println("Set Mechanical at index 2");
		printed(List1);
		
		System.out.println("Printing element at index 2");
		System.out.println(List1.get(2));
		System.out.println();
		
		System.out.println("Printing index of CSE");
		System.out.println(List1.indexOf("CSE"));
		System.out.println();
	
		System.out.println("Checking if ArrayList contains 'CSE' Keyword");
		System.out.println(List1.contains("CSE"));
		System.out.println();
		printed(List1);
	}
	
	public static void printed(ArrayList<String> List1) {
		for (String x:List1) {
			System.out.println(x);	
		}
		System.out.println();
	}
	
}
