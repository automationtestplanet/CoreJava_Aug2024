package collections;

public class Student implements Comparable<Student> {
	public String name;
	public int rollNo;
	public String qualification;

	public Student() {

	}

	public Student(String name, int empId, String job) {
		this.name = name;
		this.rollNo = empId;
		this.qualification = job;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNo;
	}

	public String getQualification() {
		return qualification;
	}

	@Override
	public int compareTo(Student student1) {
		if (student1.getRollNumber() < this.getRollNumber())
			return 0;
		else
			return -1;
	}

}
