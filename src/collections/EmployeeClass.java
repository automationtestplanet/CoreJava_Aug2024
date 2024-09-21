package collections;

public class EmployeeClass {
	public String name;
	public int empId;
	public String job;
	public long salary;

	public EmployeeClass() {

	}

	public EmployeeClass(String name, int empId, String job, long salary) {
		this.name = name;
		this.empId = empId;
		this.job = job;
		this.salary = salary;
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

	public long getSalary() {
		return salary;
	}

}
