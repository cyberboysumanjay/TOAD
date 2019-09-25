package labworks;

import java.util.ArrayList;

public class Borrower {
	String nameString,issueDate,dueDate;
	int id;

	
	public Borrower(String name, int id) {
		this.nameString=name;
		this.id=id;	
	}
	
	public String getDates(int id) {
		return "Issued on "+issueDate+" "+"Due by "+dueDate;
	}
	public int borrow(int status,Books b,ArrayList<Books> books) {
		if (books.contains(b)) {
			if (status>1) {
				status--;
				return status;
			}
		}
		else
			return -1;
		return -1;
	}
	
	
}
