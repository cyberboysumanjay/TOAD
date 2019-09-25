package labworks;

import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		String bookName,borrowerName;
		Borrower b1=new Borrower("Sumanjay",40);
		Borrower b2=new Borrower("Arpit",11);
		
		Books bo1=new Books("Half Girlfriend", "Chetan Bhagat", 4, 2);
		Books bo2=new Books("Harry Potter", "JK Rowling", 5, 3);
		
		ArrayList <Books> books = new ArrayList<Books>();
		ArrayList <Borrower> borrowers=new ArrayList<Borrower>();
		
		borrowers.add(b1);
		borrowers.add(b2);
		books.add(bo1);
		books.add(bo2);
		
		int s=b1.borrow(bo1.getStatus(), bo1, books);
		System.out.println(s);
		
		int K=b1.borrow(bo2.getStatus(), bo2, books);
		System.out.println(K);		
		
	}
}
