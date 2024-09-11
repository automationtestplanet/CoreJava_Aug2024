package oops.encapsulation;

public class EncapsulationClass { // we can use either public or default

	private String name;
	private int age;
	private long salary;
	private long balanceAmount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	protected void setBalanceAmount(long balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	long getBalanceAmount() {
		return balanceAmount;
	}

	void displayData() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args) {
		EncapsulationClass enCls = new EncapsulationClass();
		enCls.name = "Raju";
	}

}
