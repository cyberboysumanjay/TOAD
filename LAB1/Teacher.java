import java.util.ArrayList;


public class Teacher {

	ArrayList<String> coursesStrings=new ArrayList<>();
	
	//String sportsName;
	public void setCourses(ArrayList<String> s) {
		this.coursesStrings=s;
	}
	public ArrayList<String> getCourses(){
		return coursesStrings;
	}
	
}
