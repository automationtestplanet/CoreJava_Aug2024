package fundamentals;

public final class StudentDetails {

	String name;
	int rollNo;
	static String qualfication;
	static final String COLLEGE_NAME = "GVK College";
	
	public StudentDetails(String name, int rollNo, final String qualification){
		this.name = name;
		this.rollNo = rollNo;
//		qualification = "MLR College";  // can not modify final data
		StudentDetails.qualfication = qualification;
	}
	
	public final void displayStudentails() {
		System.out.println("Student Name: "+ name);
		System.out.println("Student RollNo : "+ rollNo);
		System.out.println("Student Qualification: "+ qualfication);
		System.out.println("Student College Name: "+ COLLEGE_NAME);
	}
	
	public static void main(String[] args) {
		StudentDetails student1 = new StudentDetails( "Sai",101,"B.Tech");		
		StudentDetails student2 = new StudentDetails("Ram",102, "B.Tech");		
		StudentDetails student3 = new StudentDetails("Krish", 103, "B.Tech");
		
		
		System.out.println("----------------Student1 Details----------------------");
//		StudentDetails.COLLEGE_NAME = "MLR College";   // can not modify final data
		student1.name = "Sai Krishna";
		student1.displayStudentails();
		
		
		System.out.println("----------------Student2 Details----------------------");
		student2.displayStudentails();
		
		System.out.println("----------------Student3 Details----------------------");
		student3.displayStudentails();

	}

}
