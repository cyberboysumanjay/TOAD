import java.util.ArrayList;


public class Student extends sportsPerson{
//Grade[] courses[],

	ArrayList<String> coursesStrings=new ArrayList<>();
	//String[] coursesStrings={"Physics","Chemistry","Maths"};
	//String[] gradesStrings={"A","B","A+"};

	ArrayList<String> gradesStrings=new ArrayList<>();
	//String sportsName;
	public void setCourses(ArrayList<String> s) {
		this.coursesStrings=s;
	}
	public void setGrades(ArrayList<String> s) {
		this.gradesStrings=s;
	}
	public ArrayList<String> getCourses(){
		return coursesStrings;
	}
	public ArrayList<String> getGrades(){
		return gradesStrings;
	}
	public void Display() {
		System.out.println("Name is: "+nameString);
		System.out.println("Age is: " +age);
		if (sportsName!=null)
			System.out.println("Sports: "+sportsName);
		System.out.println(coursesStrings);
		System.out.println(gradesStrings);
	}

}
