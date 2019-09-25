package labworks;

import java.util.ArrayList;

public class Books {
	String name,author;
	int copies,status=0;

	public Books(String bookName,String authorName,int copies,int status) {
		this.name=bookName;
		this.author=authorName;
		this.copies=copies;
		this.status=status;
	}

	public void addBook(ArrayList<Books> books, Books b) {
		books.add(b);
	}

	public void removeBook(ArrayList<Books> books, Books b) {
		books.remove(b);
	}

	public void getBooks(ArrayList<Books> books) {
		System.out.println(books);
	}

	public int getStatus() {
		return this.status;
	}
}
