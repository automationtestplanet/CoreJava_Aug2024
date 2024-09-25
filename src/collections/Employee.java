package collections;

public class Employee {
	public String name;
	public int empId;
	public String job;

	public Employee() {

	}

	public Employee(String name, int empId, String job) {
		this.name = name;
		this.empId = empId;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getJob() {
		return job;
	}
	
	
}
