import java.util.ArrayList;
import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Student person=new Student();
		Scanner s=new Scanner(System.in);
		ArrayList<String> studentSubList=new ArrayList<>();
		ArrayList<String> studentGradeList=new ArrayList<>();
		ArrayList<String> teacherCourseList=new ArrayList<>();
		
		System.out.println("Welcome\n Who are you?\n\n1) Student\n2)Teacher\n");
		int c=s.nextInt();
		if(c==1){
			System.out.println("What's your Name?\n");
			String name= s.next();
			person.setName(name);

			System.out.println("What's your Age?\n");
			int age=s.nextInt();
			person.setAge(age);

			System.out.println("What's your sport?\n");
			String spName= s.next();
			person.setSportsName(spName);
			
			
			System.out.println("How many Subjects do you have?\n");
			int n=s.nextInt();

			System.out.println("Enter Names of Courses");
			for (int i=0;i<n;i++){
				studentSubList.add(s.next());
			}
			person.setCourses(studentSubList);
			System.out.println("Enter your Grades\n");
			
			for (int i=0;i<n;i++){
				studentGradeList.add(s.next());
			}
			person.setGrades(studentGradeList);
			
			person.Display();
	
		}
		else{
			System.out.println("What's your Name?\n");
			String name= s.next();
			person.setName(name);

			System.out.println("What's your Age?\n");
			int age=s.nextInt();
			person.setAge(age);
			
			
			System.out.println("How many Subjects do you teach?\n");
			int n=s.nextInt();
			System.out.println("Enter Names of Courses");
			for (int i=0;i<n;i++){
				studentSubList.add(s.next());
			}
			person.setCourses(studentSubList);
			person.Display();
			
		}

	}

}
