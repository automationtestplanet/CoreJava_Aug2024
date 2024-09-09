package fundamentals;

public class Student {
	String name;
	int rollNo;
	static String qualfication;
	static String CollegName;
	
	public void displayStudentails() {
		System.out.println("Student Name: "+ name);
		System.out.println("Student RollNo : "+ rollNo);
		System.out.println("Student Qualification: "+ qualfication);
		System.out.println("Student College Name: "+ CollegName);
	}

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Sai";
		student1.rollNo = 101;
		student1.qualfication = "B.Tech";
		student1.CollegName = "GVK College";

		Student student2 = new Student();
		student2.name = "Ram";
		student2.rollNo = 102;
		student2.qualfication = "B.Tech";
		student2.CollegName = "GVK College";

		Student student3 = new Student();
		student3.name = "Krish";
		student3.rollNo = 103;
		student3.qualfication = "B.Tech";
		student3.CollegName = "GVK College";
		
		System.out.println("----------------Student1 Details----------------------");
		student1.CollegName = "MLR College";
		student1.name = "Sai Krishna";
		student1.displayStudentails();
		
		
		System.out.println("----------------Student2 Details----------------------");
		student2.displayStudentails();
		
		System.out.println("----------------Student3 Details----------------------");
		student3.displayStudentails();

	}
}

